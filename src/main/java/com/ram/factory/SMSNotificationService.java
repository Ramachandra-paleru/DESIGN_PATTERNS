package com.ram.factory;

public class SMSNotificationService extends NotificationService {
    @Override
    protected Notification createNotification() {
        return new SmsNotification();
    }
}
