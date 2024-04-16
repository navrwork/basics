package com.navr.patterns.behavioral.strategy;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
        System.out.printf("%nNew strategy set. strategy=%s%n",strategy.getClass().getSimpleName());
    }

    public void executeStrategy(String destination) {
        System.out.println("Inside executeStrategy() method. destination="+destination);
        strategy.execute(destination);
    }
}
