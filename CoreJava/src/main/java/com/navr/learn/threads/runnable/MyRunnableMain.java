package com.navr.learn.threads.runnable;

public class MyRunnableMain {

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnableTask());
        thread.start();
    }
}
