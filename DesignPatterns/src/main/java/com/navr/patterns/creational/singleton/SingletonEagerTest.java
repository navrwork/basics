package com.navr.patterns.creational.singleton;

public class SingletonEagerTest {

    public static void main(String[] args) {
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();

        System.out.printf("singletonEager1=%s, singletonEager2=%s %n", singletonEager1, singletonEager2);
    }
}
