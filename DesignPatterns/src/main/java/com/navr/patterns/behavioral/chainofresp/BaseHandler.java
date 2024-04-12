package com.navr.patterns.behavioral.chainofresp;

public class BaseHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void handle(Object request) {
        // handle request and invoke the next handler in-line

        // #1: handle req
        // ...

        // #2: Invoke the next handler
        if (nextHandler != null) {
            nextHandler.handle(request);
        } else {
            System.out.println("No more handler found.");
        }

    }

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }
}
