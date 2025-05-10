package com.alexandresouva.javadojo.oop.example;

import com.alexandresouva.javadojo.oop.domain.EmailSender;
import com.alexandresouva.javadojo.oop.domain.NotificationSender;
import com.alexandresouva.javadojo.oop.domain.SecureEmailSender;

public class NotificationSenderExample {
    public static void main(String[] args) {
        NotificationSender generic = new NotificationSender();
        generic.connect();
        generic.send("user1", "Hello!");
        generic.printDetails();
        generic.disconnect();

        System.out.println("------------");

        EmailSender email = new EmailSender();
        email.connect();
        email.addAttachment("file.pdf");
        email.send("user2", "Check the attached document.");
        email.printDetails();
        email.disconnect();

        System.out.println("------------");

        SecureEmailSender secureEmail = new SecureEmailSender();
        secureEmail.connect();
        secureEmail.enableEncryption();
        secureEmail.send("user3", "This is a confidential message.");
        secureEmail.printDetails();
        secureEmail.disconnect();
    }
}
