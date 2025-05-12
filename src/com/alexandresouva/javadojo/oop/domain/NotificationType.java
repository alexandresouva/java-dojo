package com.alexandresouva.javadojo.oop.domain;

public enum NotificationType {
    GENERIC(1, "Generic Notification"),
    EMAIL(2, "Email Notification"),
    SECURE_EMAIL(3, "Secure Email Notification");

    private final int code;
    private final String description;

    NotificationType(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public static NotificationType fromCode(int code) {
        for (NotificationType type : NotificationType.values()) {
            if (type.code == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid NotificationType code: " + code);
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
