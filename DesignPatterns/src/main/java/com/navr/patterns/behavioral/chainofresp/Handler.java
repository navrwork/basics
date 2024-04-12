package com.navr.patterns.behavioral.chainofresp;

public interface Handler {

    public void handle(Object request);

    public void setNext(Handler handler);
}
