package com.navr.patterns.creational.factorymethod.v2;

class SeaLogistics extends Logistics {
    public Transport createTransport() {
        System.out.println("SeaLogistics: transport done via Ship.");
        return new Ship();
    }
}