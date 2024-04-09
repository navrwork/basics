package com.navr.patterns.creational.abstractfactory;

public class VictorianFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public String printInfo() {
        return "INFO: VictorianChair / VictorianSofa";
    }
}
