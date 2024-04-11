package com.navr.patterns.structural.decorator;

public class CoffeeMachineTest {

    public static void main(String[] args) {
        NormalCoffeeMachine normalCoffeeMachine = new NormalCoffeeMachine();
        EnhancedCoffeeMachine enhancedCoffeeMachine = new EnhancedCoffeeMachine(normalCoffeeMachine);

        enhancedCoffeeMachine.makeSmallCoffee();
        enhancedCoffeeMachine.makeLargeCoffee();
        enhancedCoffeeMachine.makeMasalaCoffee();
    }
}
