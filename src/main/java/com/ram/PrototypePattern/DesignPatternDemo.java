package com.ram.PrototypePattern;

public class DesignPatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Testing Copy Constructor Implementation
        GameCharacter warriorPrototype = new GameCharacter("Warrior Base");
        warriorPrototype.addWeapon("Sword");

        GameCharacter customHero = (GameCharacter) warriorPrototype.clone();
        customHero.addWeapon("Shield");

        System.out.println(warriorPrototype); // Out: Character: Warrior Base | Inventory: [Sword]
        System.out.println(customHero);        // Out: Character: Warrior Base | Inventory: [Sword, Shield]

        // Testing Native Cloneable Implementation
        NetworkConfig baseConfig = new NetworkConfig("Production-Cluster");
        baseConfig.addProtocol("HTTPS");

        NetworkConfig stagingConfig = baseConfig.clone();
        stagingConfig.addProtocol("FTP");

        System.out.println(baseConfig);    // Out: Server: Production-Cluster | Protocols: [HTTPS]
        System.out.println(stagingConfig); // Out: Server: Production-Cluster | Protocols: [HTTPS, FTP]
    }
}
