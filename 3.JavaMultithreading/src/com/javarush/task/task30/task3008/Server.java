package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by AndrewUkraine on 21.01.2018.
 */
public class Server {


    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();


    public static void sendBroadcastMessage(Message message) {
        for (Connection connection : connectionMap.values()) {
            try {
                connection.send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Error sending message");
            }
        }
    }

    public static void main(String[] args) {
        ConsoleHelper.writeMessage("Input server port: ");
        try (ServerSocket serverSocket = new ServerSocket(ConsoleHelper.readInt())) {
            ConsoleHelper.writeMessage("Server started...");
            while (true) {
                new Handler(serverSocket.accept()).start();
            }
        } catch (Exception e) {
            ConsoleHelper.writeMessage("Something wrong, Server socket closed.");
        }
    }

    private static class Handler extends Thread {

        private Socket socket;

        private Handler(Socket socket) {
            this.socket = socket;
        }


        @Override
        public void run() {
            if (socket != null && socket.getRemoteSocketAddress() != null) {
                ConsoleHelper.writeMessage("Conected sucses " + socket.getRemoteSocketAddress());
            }
            String userName = null;


            try (Connection connection = new Connection(socket)) {
                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                sendListOfUsers(connection, userName);
                serverMainLoop(connection, userName);

            } catch (IOException | ClassNotFoundException e) {
                ConsoleHelper.writeMessage("An exchange of data error to a remote socket address");
            }
if (userName!=null)
            connectionMap.remove(userName);
            sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
            ConsoleHelper.writeMessage("Connection is closed");
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {

            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message answear = connection.receive();
                if (answear.getType() == MessageType.USER_NAME) {
                    if (!answear.getData().isEmpty()) {
                        if (!connectionMap.containsKey(answear.getData())) {

                            connectionMap.put(answear.getData(), connection);

                            connection.send(new Message(MessageType.NAME_ACCEPTED));
                            return answear.getData();
                        }

                    }

                }

            }
        }


        private void sendListOfUsers(Connection connection, String userName) throws IOException {
            for (Map.Entry<String, Connection> entry : connectionMap.entrySet()) {
                if (!entry.getKey().equals(userName)) {
                    connection.send(new Message(MessageType.USER_ADDED, entry.getKey()));
                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message != null && message.getType() == MessageType.TEXT) {
                    sendBroadcastMessage(new Message(MessageType.TEXT, userName + ": " + message.getData()));
                } else {
                    ConsoleHelper.writeMessage("Error!");
                }
            }
        }

    }
}











