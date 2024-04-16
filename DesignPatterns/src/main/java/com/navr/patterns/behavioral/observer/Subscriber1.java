package com.navr.patterns.behavioral.observer;

public class Subscriber1 implements Subscriber {
    @Override
    public void update(String updateMsg) {
        System.out.println("Subscriber1 got an update. msg="+updateMsg);
    }
}
