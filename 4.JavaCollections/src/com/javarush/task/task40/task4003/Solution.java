package com.javarush.task.task40.task4003;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

/* 
Отправка письма с файлом
*/

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.sendMail("shatov@push-k.com.ua", "shatov10", "andrii0938630809@gmail.com");
    }

    public void sendMail(final String username, final String password, final String recipients) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.push-k.com.ua"); // менял
        props.put("mail.smtp.port", "26"); //менял

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipients));

            setSubject(message, "Тема письма"); //ТЕМА ПИСЬМА
           // setText(message, "Asta la vista, baby!"); // ВОТ ТЕКСТ ИЛИ ТЕКСТ ИЛИ ВЛОЖЕНИЕ
            setAttachment(message, "C:\\123.JPG"); //ВОТ СЮДА ФАЙЛ ДЛЯ ОТПРАВКИ

            // message.setText("Asta la vista, baby!"); // ВОТ ТЕКСТ ИЛИ ТЕКСТ ИЛИ ВЛОЖЕНИЕ


            Transport.send(message);
            System.out.println("Письмо было отправлено.");

        } catch (MessagingException e) {
            System.out.println("Ошибка при отправке: " + e.toString());
        }
    }

    //метод для темы письма
    public static void setSubject(Message message, String subject) throws MessagingException {
        message.setSubject(subject);
    }

    //метод для темы письма
    /*public static void setText(Message message, String subject) throws MessagingException {
        message.setSubject(subject);
    }*/





    //метод для атача
    public static void setAttachment(Message message, String filename) throws MessagingException {

        // Create a multipar message
        Multipart multipart = new MimeMultipart();
        BodyPart messageBodyPart = new MimeBodyPart();

        //Set File
        DataSource source = new FileDataSource(filename);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(filename);

        //Add "file part" to multipart
        multipart.addBodyPart(messageBodyPart);

        //Set multipart to message
        message.setContent(multipart);


    }
}

