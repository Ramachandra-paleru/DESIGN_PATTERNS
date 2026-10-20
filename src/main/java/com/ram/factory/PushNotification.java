package com.ram.factory;

public class PushNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending a mobile Push notification...");
    }
}
