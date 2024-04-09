package com.navr.patterns.creational.abstractfactory;

public class VictorianChair implements Chair{
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        // do something
    }
}
