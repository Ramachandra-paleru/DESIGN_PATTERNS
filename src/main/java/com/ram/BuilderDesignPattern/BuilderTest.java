package com.ram.BuilderDesignPattern;

public class BuilderTest {
    static void main() {
        Computer gamingPC = new Computer.Builder("1TB SSD", "32GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();
        System.out.println("Gaming PC: "+gamingPC);
        Computer officePC = new Computer.Builder("500GB HDD", "8GB")
                .build();
        System.out.println("Office PC: "+officePC);
    }
}
