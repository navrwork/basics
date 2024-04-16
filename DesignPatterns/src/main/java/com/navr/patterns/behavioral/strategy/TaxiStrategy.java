package com.navr.patterns.behavioral.strategy;

public class TaxiStrategy implements Strategy {

    @Override
    public void execute(String destination) {
        System.out.println("TaxiStrategy: Reaching destination by riding a Taxi. destination="+destination);
    }
}
