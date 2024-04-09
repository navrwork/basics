package com.navr.patterns.creational.singleton;

public class SingletonLazy {

    private static SingletonLazy instance = null;

    private SingletonLazy() {
        // private constructor
    }

    public static SingletonLazy getInstance() {
        if (instance==null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
