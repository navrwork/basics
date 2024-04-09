package com.navr.patterns.creational.singleton;

public class SingletonLazyTest {

    public static void main(String[] args) {
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();

        System.out.printf("singletonLazy1=%s, singletonLazy2=%s%n", singletonLazy1, singletonLazy2);
    }
}
