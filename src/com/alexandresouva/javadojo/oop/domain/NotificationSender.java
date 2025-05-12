package com.alexandresouva.javadojo.oop.domain;

public class NotificationSender {
    private static int count = 0;

    private final int SENDER_ID;
    private boolean connected = false;
    protected NotificationType notificationType;

    public NotificationSender() {
        this.SENDER_ID = ++count;
        this.notificationType = NotificationType.GENERIC;
    }

    public final void connect() {
        if (this.connected) {
            throw new IllegalStateException("Notification service is already connected");
        }
        System.out.println("Connecting to notification service...");
        this.connected = true;
    }

    public void send(String recipient, String message) {
        if (!this.connected) {
            throw new IllegalStateException("Notification service is not connected");
        }
        System.out.println("Sending generic notification to " + recipient + ": " + message);
    }

    public final void disconnect() {
        if (!this.connected) {
            throw new IllegalStateException("Notification service is already disconnected");
        }
        System.out.println("Disconnecting from notification service...");
        this.connected = false;
    }

    public void printDetails() {
        System.out.println("Notification sender ID: " + this.SENDER_ID);
        System.out.println("Connected: " + this.connected);
        System.out.println("Notification type: " + this.notificationType);
    }
    // ------------------------------------//
    // 🚩 Important notes:

    // - static field:
    //   Shared among all instances of the class.

    // - final field:
    //   Can be assigned only once (usually in constructor).

    // - final method:
    //   Cannot be overridden in subclasses.

    // - static counter pattern:
    //   Often used to assign auto-incremented IDs to instances.
}
