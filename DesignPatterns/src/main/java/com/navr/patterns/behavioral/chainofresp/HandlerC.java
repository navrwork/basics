package com.navr.patterns.behavioral.chainofresp;

public class HandlerC extends BaseHandler {

    @Override
    public void handle(Object request) {
        System.out.println("Inside HandlerC.handle()");
        super.handle(request);
    }
}
