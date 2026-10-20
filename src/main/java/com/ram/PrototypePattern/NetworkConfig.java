package com.ram.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

class NetworkConfig implements Cloneable {
    private String serverName;
    private List<String> protocols;

    public NetworkConfig(String serverName) {
        this.serverName = serverName;
        this.protocols = new ArrayList<>();
    }

    public void addProtocol(String protocol) {
        this.protocols.add(protocol);
    }

    @Override
    public NetworkConfig clone() throws CloneNotSupportedException {
        // Step 1: Obtain a native shallow copy
        NetworkConfig cloned = (NetworkConfig) super.clone();

        // Step 2: Manually deep copy mutable data structures
        cloned.protocols = new ArrayList<>(this.protocols);

        return cloned;
    }

    @Override
    public String toString() {
        return "Server: " + serverName + " | Protocols: " + protocols;
    }
}

