package com.navr.patterns.creational.singleton;

public class SingletonStaticBlockTest {

    public static void main(String[] args) {
        SingletonStaticBlock singletonStaticBlock1 = SingletonStaticBlock.getInstance();
        SingletonStaticBlock singletonStaticBlock2 = SingletonStaticBlock.getInstance();

        System.out.printf("singletonStaticBlock1=%s, singletonStaticBlock1=%s%n",
                singletonStaticBlock1, singletonStaticBlock2);
    }
}
