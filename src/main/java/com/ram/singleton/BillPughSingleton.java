package com.ram.singleton;
/*
Leverages the Java class loader mechanism. The inner class is not loaded into memory until getInstance() is explicitly called.
• Pros: Exceptionally fast, clean, lazy-loaded, and automatically thread-safe without explicit locks.
• Cons: Java-specific approach.
 */
public class BillPughSingleton {
    private BillPughSingleton() {}
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    static void main() {
        System.out.println(getInstance());
        System.out.println(getInstance());
    }
}
