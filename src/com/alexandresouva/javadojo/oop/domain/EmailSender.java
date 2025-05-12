package com.alexandresouva.javadojo.oop.domain;

public class EmailSender extends  NotificationSender {
    public EmailSender() {
        super();
        this.notificationType = NotificationType.EMAIL;
    }

    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending **EMAIL** to " + recipient + ": " + message);
    }

    public void addAttachment(String fileName) {
        System.out.println("Adding attachment: " + fileName);
    }
}
