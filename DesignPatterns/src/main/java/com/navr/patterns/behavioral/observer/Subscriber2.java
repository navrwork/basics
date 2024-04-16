package com.navr.patterns.behavioral.observer;

public class Subscriber2 implements Subscriber {
    @Override
    public void update(String updateMsg) {
        System.out.println("Subscriber2 got an update. msg="+updateMsg);
    }
}
