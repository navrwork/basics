package com.navr.patterns.creational.factorymethod.v2;

class RoadLogistics extends Logistics {
    public Transport createTransport() {
        System.out.println("RoadLogistics: transport done via Truck.");
        return new Truck();
    }
}