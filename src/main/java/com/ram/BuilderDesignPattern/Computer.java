package com.ram.BuilderDesignPattern;

// 1. The Product Class
public class Computer {
    // Required parameters
    private final String HDD;
    private final String RAM;

    // Optional parameters
    private final boolean isGraphicsCardEnabled;
    private final boolean isBluetoothEnabled;

    // Private constructor forces usage of the Builder
    private Computer(Builder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    // Getters...

    // 2. The Static Inner Builder Class
    public static class Builder {
        private final String HDD;
        private final String RAM;
        private boolean isGraphicsCardEnabled = false; // Default values
        private boolean isBluetoothEnabled = false;

        // Constructor for REQUIRED fields
        public Builder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        // Setter-like methods that return 'this' for method chaining
        public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        // 3. The Build Method to assemble the final object
        public Computer build() {
            return new Computer(this);
        }
    }
}

