package com.navr.patterns.structural.decorator;

public class EnhancedCoffeeMachine implements CoffeeMachine {

    private NormalCoffeeMachine normalCoffeeMachine;

    public EnhancedCoffeeMachine(NormalCoffeeMachine normalCoffeeMachine) {
        this.normalCoffeeMachine = normalCoffeeMachine;
    }

    // Alter behaviour
    @Override
    public void makeSmallCoffee() {
        System.out.println("EnhancedCoffeeMachine: makeSmallCoffee .. altered as needed.");
    }

    // Unaltered behaviour
    @Override
    public void makeLargeCoffee() {
        normalCoffeeMachine.makeLargeCoffee();
        System.out.println("EnhancedCoffeeMachine: makeLargeCoffee .. unaltered.");
    }

    // Extended behaviour
    public void makeMasalaCoffee() {
        System.out.println("EnhancedCoffeeMachine: makeMasalaCoffee .. Extended behaviour.");
    }
}
