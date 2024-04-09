package com.navr.patterns.creational.factorymethod;

public class Pizza implements IFood {

    @Override
    public String getFoodShape() {
        return "round";
    }
}
