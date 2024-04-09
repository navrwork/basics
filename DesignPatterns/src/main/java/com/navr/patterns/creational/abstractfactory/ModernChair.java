package com.navr.patterns.creational.abstractfactory;

public class ModernChair implements Chair {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        // do something
    }
}
