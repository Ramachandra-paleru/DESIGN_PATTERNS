package com.ram.factory;

public class FactoryTest {
    static void main() {
        NotificationService service = new PushNotificationService();
        service.sendNotification();
        NotificationService emailService = new EmailNotificationService();
        emailService.sendNotification();
    }
}
