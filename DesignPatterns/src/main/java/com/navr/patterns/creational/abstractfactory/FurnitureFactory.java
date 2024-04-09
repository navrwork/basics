package com.navr.patterns.creational.abstractfactory;

public interface FurnitureFactory {

    public Chair createChair();

    public Sofa createSofa();

    public String printInfo();
}
