package com.ram.singleton;

/*
* Locks the class only during the first initialization phase, checking the condition twice.
• Pros: Highly performant and completely thread-safe.
• Cons: Verbose; requires the volatile keyword in Java to prevent memory reordering issues.
* */
public class DatabaseConnection {
    private static volatile DatabaseConnection instance;

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        // Run two threads concurrently to fetch the instance
        Runnable task = () -> {
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " Instance HashCode: " + instance.hashCode());
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}
