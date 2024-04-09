package com.navr.patterns.creational.singleton;

public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {

    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
