package com.alexandresouva.javadojo.oop.domain;

public final class SecureEmailSender extends EmailSender {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending **SECURE EMAIL** to " + recipient + " with encryption: " + message);
    }

    public void enableEncryption() {
        System.out.println("Encryption enabled for secure email.");
    }

    @Override
    public void printDetails() {
        System.out.println("SecureEmailSender details:");
        super.printDetails();
        System.out.println("Encryption is enabled for this sender.");
    }
}
