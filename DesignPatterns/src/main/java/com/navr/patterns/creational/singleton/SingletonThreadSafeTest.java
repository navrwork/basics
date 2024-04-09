package com.navr.patterns.creational.singleton;

public class SingletonThreadSafeTest {

    public static void main(String[] args) {
        SingletonThreadSafe singletonThreadSafe1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe singletonThreadSafe2 = SingletonThreadSafe.getInstance();

        System.out.printf("singletonThreadSafe1=%s, singletonThreadSafe2=%s%n",
                singletonThreadSafe1, singletonThreadSafe2);
    }
}
