package com.ram.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

// 2. Concrete Implementation using a copy constructor
class GameCharacter implements Prototype {
    private String name;
    private List<String> inventory; // Mutable reference object

    public GameCharacter(String name) {
        this.name = name;
        this.inventory = new ArrayList<>();
    }

    // Copy Constructor dedicated to generating deep copies
    public GameCharacter(GameCharacter source) {
        this.name = source.name;
        // Deep copy internal objects/lists to isolate reference changes
        this.inventory = new ArrayList<>(source.inventory);
    }

    public void addWeapon(String weapon) {
        this.inventory.add(weapon);
    }

    @Override
    public Prototype clone() {
        return new GameCharacter(this); // Passes itself to the copy constructor
    }

    @Override
    public String toString() {
        return "Character: " + name + " | Inventory: " + inventory;
    }
}
