package com.navr.patterns.creational.factorymethod;

public class Cake implements IFood {

    @Override
    public String getFoodShape() {
        return "rectangle";
    }
}
