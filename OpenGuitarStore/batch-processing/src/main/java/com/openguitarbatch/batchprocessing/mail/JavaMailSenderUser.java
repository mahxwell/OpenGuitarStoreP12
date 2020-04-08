package com.openguitarbatch.batchprocessing.mail;

import org.springframework.mail.SimpleMailMessage;

public class JavaMailSenderUser extends JavaMailSenderHost {

    public static void sendMessageToUserForNewsLetter(String userMail, String userPseudo) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(userMail);
        message.setSubject("NewsLetter OpenguitarStore");
        message.setText("Bonjour " + userPseudo + "\n" + "Voici votre fausse Newsletter");
        getJavaMailSender().send(message);
    }

    public static void sendMessageToUserForReservation(String userMail, String userPseudo,
                                                       String guitarBrand,
                                                       String guitarName) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(userMail);
        message.setSubject("Votre Reservation est disponible");
        message.setText("Bonjour " + userPseudo + "\n\n" + "Le modèle  "
                + guitarBrand + " "+ guitarName + " est à nouveau disponible \n"+
        "Ne perdez pas de temps et commandez maintenant !\n\n" + "L'équipe OpenguitarStore");
        getJavaMailSender().send(message);
    }
}
