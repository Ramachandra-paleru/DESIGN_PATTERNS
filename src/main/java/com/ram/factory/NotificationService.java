package com.ram.factory;

public abstract class NotificationService {
    // The Factory Method - Subclasses will implement this
    protected abstract Notification createNotification();

    // The business logic remains identical and untouched
    public void sendNotification() {
        Notification notification = createNotification();
        notification.notifyUser();
    }
}
