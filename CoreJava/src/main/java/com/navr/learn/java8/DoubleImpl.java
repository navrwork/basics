package com.navr.learn.java8;

public class DoubleImpl implements DoubleFunction {
    @Override
    public long findDouble(int number) {
        return (long)2*number;
    }
}
