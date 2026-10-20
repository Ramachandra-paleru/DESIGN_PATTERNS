package com.ram.singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable {

    private static  LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    static void main() {
        System.out.println(getInstance());
        System.out.println(getInstance());
    }
}
