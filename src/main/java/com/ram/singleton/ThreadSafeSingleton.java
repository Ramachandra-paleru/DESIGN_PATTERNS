package com.ram.singleton;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
/*Adds a lock to the entire getter method to handle multiple threads.
• Pros: Thread-safe.
• Cons: Massive performance bottleneck because every single
read access requires synchronization.*/
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    static void main() {
        System.out.println(getInstance());
    }
}
