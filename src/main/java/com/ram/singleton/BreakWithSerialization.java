package com.ram.singleton;

import java.io.*;

public class BreakWithSerialization {

    static void main() throws IOException, ClassNotFoundException {
        LazySingleton instance1 = LazySingleton.getInstance();

        // 1. Serialize (Save instance to a file)
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.obj"));
        out.writeObject(instance1);
        out.close();
        // 2. Deserialize (Read instance back from the file)
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.obj"));
        LazySingleton instance2 = (LazySingleton) in.readObject();
        in.close();
        System.out.println("Instance 1 Hash: " + instance1.hashCode());
        System.out.println("Instance 2 Hash: " + instance2.hashCode());
    }
}
