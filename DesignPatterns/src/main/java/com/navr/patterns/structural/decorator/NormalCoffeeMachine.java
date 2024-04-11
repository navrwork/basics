package com.navr.patterns.structural.decorator;

/**
 * Let's assume that this interface is part of a
 * 3rd party library that cannot be altered.
 */
public class NormalCoffeeMachine implements CoffeeMachine {
    @Override
    public void makeSmallCoffee() {
        System.out.println("NormalCoffeeMachine: makeSmallCoffee");
    }

    @Override
    public void makeLargeCoffee() {
        System.out.println("NormalCoffeeMachine: makeLargeCoffee");
    }
}
