package com.ram.AbstractFacory;

public class DarkButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Dark Mode Button.");
    }
}
