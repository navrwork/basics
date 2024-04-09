package com.navr.patterns.creational.singleton;

public class SingletonStaticBlock {

    private static SingletonStaticBlock instance = null;

    static {
        instance = new SingletonStaticBlock();
    }

    private SingletonStaticBlock() {
        // private constructor
    }

    public static SingletonStaticBlock getInstance() {
        return instance;
    }

}
