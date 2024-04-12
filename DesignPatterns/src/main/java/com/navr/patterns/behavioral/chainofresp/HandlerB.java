package com.navr.patterns.behavioral.chainofresp;

public class HandlerB extends BaseHandler {

    @Override
    public void handle(Object request) {
        System.out.println("Inside HandlerB.handle()");
        super.handle(request);
    }
}
