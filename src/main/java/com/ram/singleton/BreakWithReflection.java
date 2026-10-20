package com.ram.singleton;

import java.lang.reflect.Constructor;

public class BreakWithReflection {
    public static void main(String[] args) throws Exception {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = null;

        // Access the private constructor dynamically
        Constructor<LazySingleton> constructor = LazySingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true); // Force visibility to public

        // Instantiate a second object
        instance2 = constructor.newInstance();

        System.out.println("Instance 1 Hash: " + instance1.hashCode());
        System.out.println("Instance 2 Hash: " + instance2.hashCode());
    }
}
