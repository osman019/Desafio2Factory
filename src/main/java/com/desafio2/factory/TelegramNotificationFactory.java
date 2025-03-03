package com.desafio2.factory;

import com.desafio2.notifications.Notification;
import com.desafio2.notifications.TelegramNotification;


public class TelegramNotificationFactory  implements NotificationFactory {
 @Override
    public Notification  createNotification () {
        return new TelegramNotification();
}
}