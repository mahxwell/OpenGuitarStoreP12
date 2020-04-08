package com.openguitarbatch.batchprocessing.mail;


import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

public class JavaMailSenderHost {

    private static String HOST = "smtp.gmail.com";
    private static String PORT = "587";
    private static String USERNAME = "openlibmailsender@gmail.com";
    private static String PASSWORD = "mailsender";


    public static JavaMailSender getJavaMailSender() {

        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

        mailSender.setHost(HOST);
        mailSender.setPort(Integer.parseInt(PORT));
        mailSender.setUsername(USERNAME);
        mailSender.setPassword(PASSWORD);

        Properties properties = mailSender.getJavaMailProperties();
        properties.put("mail.transport.protocol", "smtp");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.debug", "true");

        return mailSender;
    }
}
