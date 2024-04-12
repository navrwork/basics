package com.navr.patterns.structural.decorator;

/**
 * Decorator is a structural design pattern that lets you attach new behaviors to objects
 * by placing these objects inside special wrapper objects that contain the behaviors.
 * <br/><br/>
 * Reference: <a href="https://refactoring.guru/design-patterns/decorator">Decorator pattern</a>
 */
public class CoffeeMachineTest {

    public static void main(String[] args) {
        NormalCoffeeMachine normalCoffeeMachine = new NormalCoffeeMachine();
        EnhancedCoffeeMachine enhancedCoffeeMachine = new EnhancedCoffeeMachine(normalCoffeeMachine);

        enhancedCoffeeMachine.makeSmallCoffee();
        enhancedCoffeeMachine.makeLargeCoffee();
        enhancedCoffeeMachine.makeMasalaCoffee();
    }
}
