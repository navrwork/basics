package com.navr.patterns.behavioral.observer;

/**
 * Observer is a behavioral design pattern that lets you define a subscription mechanism
 * to notify multiple objects about any events that happen to the object they’re observing.
 * <br/><br/>
 * Reference: <a href="https://refactoring.guru/design-patterns/observer">Observer pattern</a>
 */
public class ObserverClient {
    public static void main(String[] args) {
        Subscriber1 subscriber1 = new Subscriber1();
        Subscriber2 subscriber2 = new Subscriber2();
        Publisher publisher = new Publisher();
        publisher.addSubscriber(subscriber1);
        publisher.addSubscriber(subscriber2);
        publisher.publishMessage("hello, welcome to our subscription.");
    }
}
