package com.navr.patterns.creational.abstractfactory;

public class ModernFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public String printInfo() {
        return "INFO: ModernChair / ModernSofa";
    }
}
