package com.desafio2.factory;

import com.desafio2.notifications.Notification;
import com.desafio2.notifications.SlackNotification;


public class SlackNotificationFactory implements NotificationFactory {
 @Override
    public Notification  createNotification() {
        return new SlackNotification();
}
}