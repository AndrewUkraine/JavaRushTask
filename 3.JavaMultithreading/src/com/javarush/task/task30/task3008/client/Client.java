package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.Connection;
import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by AndrewUkraine on 22.01.2018.
 */
public class Client {

    protected Connection connection;
    private volatile boolean clientConnected = false;

    protected String getServerAddress() {
        while (true) {
            ConsoleHelper.writeMessage("Input ServerAddress");
            String s = ConsoleHelper.readString();
            return s;
        }
    }

    protected int getServerPort() {
        while (true) {
            ConsoleHelper.writeMessage("Input ServerPort");
            int i = ConsoleHelper.readInt();
            return i;
        }
    }

    protected String getUserName() {
        while (true) {
            ConsoleHelper.writeMessage("Input UserName");
            String name2 = ConsoleHelper.readString();
            return name2;
        }
    }

    protected boolean shouldSendTextFromConsole() {
        return true;
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) {
        try {
            connection.send(new Message(MessageType.TEXT, text));
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Error");
            clientConnected = false;
        }
    }


    public void run() {
        SocketThread socketThread = getSocketThread();
        socketThread.setDaemon(true);
        socketThread.start();

        try {
            synchronized (this) {
                wait();
            }
        } catch (InterruptedException e) {
            ConsoleHelper.writeMessage("Error");
            System.exit(1);
        }

        if (clientConnected) {
            ConsoleHelper.writeMessage("Соединение установлено. Для выхода наберите команду\"exit\"");

            while (clientConnected) {
                String s = ConsoleHelper.readString();
                if (s.equalsIgnoreCase("exit")) {
                    break;
                } else {
                    if (shouldSendTextFromConsole()) {
                        sendTextMessage(s);
                    }
                }
            }
        } else {
            ConsoleHelper.writeMessage("Произошла ошибка во время работы клиента.");

        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }


    public class SocketThread extends Thread {
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
        } /*- должен выводить текст message в консоль.*/

        protected void informAboutAddingNewUser(String userName) {
            ConsoleHelper.writeMessage("User has enter the chat " + userName);
        }
        /*- должен выводить в консоль информацию о том, что участник с именем userName присоединился к чату.*/

        protected void informAboutDeletingNewUser(String userName) {
            ConsoleHelper.writeMessage("User has left the chat " + userName);
        }
     /* - должен выводить в консоль, что участник с именем userName покинул чат.*/

        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            synchronized (Client.this) {
                Client.this.clientConnected = clientConnected;
                Client.this.notify();
            }
        }

        protected void clientHandshake() throws IOException, ClassNotFoundException {
            Message massage;
            while (!clientConnected) {
                massage = connection.receive();

                if (massage.getType() == MessageType.NAME_REQUEST) {
                    connection.send(new Message(MessageType.USER_NAME, getUserName()));
                } else {
                    if (massage.getType() == MessageType.NAME_ACCEPTED) {
                        notifyConnectionStatusChanged(true);
                    } else throw new IOException("Unexpected MessageType");

                }


            }
        }

        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            Message message;

            while (true) {

                try {
                    message = connection.receive();
                } catch (Exception e) {
                    break;
                }
                if (message.getType() == MessageType.TEXT) processIncomingMessage(message.getData());
                else {
                    if (message.getType() == MessageType.USER_ADDED) informAboutAddingNewUser(message.getData());
                    else {
                        if (message.getType() == MessageType.USER_REMOVED)
                            informAboutDeletingNewUser(message.getData());
                        else break;
                    }
                }

            }
            throw new IOException("Unexpected MessageType");

        }


        public void run() {
            String serverAddress = getServerAddress();
            int serverPort = getServerPort();

            try {
                Socket socket = new Socket(serverAddress, serverPort);
                connection = new Connection(socket);
                clientHandshake();
                clientMainLoop();

            } catch (IOException | ClassNotFoundException e) {
                notifyConnectionStatusChanged(false);


            }
        }
    }}






