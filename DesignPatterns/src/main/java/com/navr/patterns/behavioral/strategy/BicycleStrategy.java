package com.navr.patterns.behavioral.strategy;

public class BicycleStrategy implements Strategy {


    @Override
    public void execute(String destination) {
        System.out.println("BicycleStrategy: Reaching destination by riding a bicycle. destination="+destination);
    }
}
