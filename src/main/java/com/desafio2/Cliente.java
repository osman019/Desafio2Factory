package com.desafio2;

import java.util.Scanner;

import com.desafio2.notifications.Notification;
import com.desafio2.factory.NotificationFactory;
import com.desafio2.factory.SlackNotificationFactory;
import com.desafio2.factory.TelegramNotificationFactory;
import com.desafio2.factory.WhatsAppNotificationFactory;

public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de notificación que desea enviar:");
        System.out.println("1. WhatsApp");
        System.out.println("2. Telegram");
        System.out.println("3. Slack");
        System.out.print("Ingrese el número de su elección: ");

        NotificationFactory notificationFactory = null;

        int option = scanner.nextInt();
        scanner.nextLine(); 

        switch (option) {
            case 1:
                notificationFactory = new WhatsAppNotificationFactory();
                break;
            case 2:
                notificationFactory = new TelegramNotificationFactory();
                break;
            case 3:
                notificationFactory = new SlackNotificationFactory();
                break;
            default:
                System.out.println("Opción no válida.");
                System.exit(0);
        }

        Notification notification = notificationFactory.createNotification();
        notification.sendMessage();
        notification.logMessage();

        scanner.close();
    }
}