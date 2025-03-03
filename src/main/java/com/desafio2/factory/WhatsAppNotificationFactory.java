package com.desafio2.factory;

import com.desafio2.notifications.Notification;
import com.desafio2.notifications.WhatsAppNotification;

public class WhatsAppNotificationFactory implements NotificationFactory {
    @Override
    public Notification  createNotification() {
        return new WhatsAppNotification();
}}
