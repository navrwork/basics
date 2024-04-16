package com.navr.patterns.behavioral.strategy;

public class PublicTransportStrategy implements Strategy {


    @Override
    public void execute(String destination) {
        System.out.println("PublicTransportStrategy: Reaching destination by riding a PublicTransport. destination="+destination);
    }
}
