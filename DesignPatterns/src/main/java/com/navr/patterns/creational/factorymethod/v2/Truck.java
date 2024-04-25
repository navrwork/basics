package com.navr.patterns.creational.factorymethod.v2;

class Truck implements Transport {
    public void deliver() {
        // Deliver by land.
        System.out.println("Delivering items via Truck ...");
    }
}