package com.navr.patterns.behavioral.strategy;

/**
 * Strategy is a behavioral design pattern that lets you define a
 * family of algorithms, put each of them into a separate class,
 * and make their objects interchangeable.
 * <br/><br/>
 * Reference: <a href="https://refactoring.guru/design-patterns/strategy"></a>
 */
public class StrategyClient {
    public static void main(String[] args) {
        // Strategy #1
        BicycleStrategy bicycleStrategy = new BicycleStrategy();
        Context context = new Context();
        context.setStrategy(bicycleStrategy);
        context.executeStrategy("Airport");

        // Strategy #2
        TaxiStrategy taxiStrategy = new TaxiStrategy();
        context.setStrategy(taxiStrategy);
        context.executeStrategy("Airport");
    }
}
