package com.ram.singleton;

import lombok.Getter;

/*
Using a single-element enum is widely considered the best way to write a Singleton in Java.
• Pros: 100% thread-safe; natively immune to Reflection attacks and Serialization vulnerabilities out-of-the-box.
• Cons: Does not support lazy initialization well.
 */
@Getter
public enum EnumSingleton {
    INSTANCE;

    // Instance variables (State)
    private String databaseUrl;
    private int maxConnections;

    // Private constructor (implicitly private, called once by the JVM)
    EnumSingleton() {
        System.out.println("Initializing AppConfig Singleton...");
        // Simulating loading configurations
        this.databaseUrl = "jdbc:mysql://localhost:3306/prod_db";
        this.maxConnections = 10;
    }

    // Business Logic Methods
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void displayConfig() {
        System.out.println("DB URL: " + databaseUrl + " | Max Conn: " + maxConnections);
    }

    static void main() {
        System.out.println("--- Accessing Instance 1 ---");
        EnumSingleton config1 = EnumSingleton.INSTANCE;
        config1.displayConfig();
        System.out.println("--- Accessing Instance 2 ---");
        EnumSingleton config2 = EnumSingleton.INSTANCE;
        config2.displayConfig();
    }
}
