package com.navr.patterns.creational.singleton;

public class SingletonThreadSafe {

    private static SingletonThreadSafe instance = null;

    private SingletonThreadSafe() {
        // private constructor
    }

    public static SingletonThreadSafe getInstance() {
        synchronized (SingletonThreadSafe.class) {
            if (instance == null) {
                instance = new SingletonThreadSafe();
            }
        }
        return instance;
    }
}
