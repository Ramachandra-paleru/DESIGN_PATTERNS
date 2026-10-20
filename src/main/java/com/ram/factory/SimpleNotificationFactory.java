package com.ram.factory;

/*In a Simple Factory setup, you have a single class
 with a switch-case statement.
 If you want to add a new notification
  type (like Push notifications), you must break
  the Open/Closed Principle by modifying the
  factory class code directly./*
 */
public class SimpleNotificationFactory {
    public static Notification createNotification(String type) {
        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SmsNotification();
            // To add "push", we MUST modify this existing class code.
            default:
                throw new IllegalArgumentException("Unknown type");
        }
    }
}
