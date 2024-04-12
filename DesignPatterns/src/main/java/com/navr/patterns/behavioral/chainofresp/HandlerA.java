package com.navr.patterns.behavioral.chainofresp;

public class HandlerA extends BaseHandler {

    @Override
    public void handle(Object request) {
        System.out.println("Inside HandlerA.handle()");
        super.handle(request);
    }
}
