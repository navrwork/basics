package com.navr.patterns.creational.factorymethod.v2;

class Ship implements Transport {
    public void deliver() {
        // Deliver by sea.
        System.out.println("Delivering items via Ship ...");
    }
}