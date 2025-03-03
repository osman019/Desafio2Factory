package com.desafio2.notifications;

public class TelegramNotification implements Notification {
    @Override
    public void sendMessage() {
        System.out.println("telegram message sent!");
    }

    @Override
    public void logMessage() {
        System.out.println("Logging telegram message.");
    }
}
