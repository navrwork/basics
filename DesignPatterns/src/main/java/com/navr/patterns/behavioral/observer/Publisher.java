package com.navr.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    private List<Subscriber> subscriberList = new ArrayList<>();

    public void publishMessage(String message) {
        if (subscriberList!=null && !subscriberList.isEmpty()) {
            for(Subscriber sub : subscriberList) {
                sub.update(message);
            }
            System.out.printf("All %d subscribers notified.%n", subscriberList.size());
        }
    }

    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
        System.out.printf("Subscriber added to the list. %s%n", subscriber.getClass().getSimpleName());
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
        System.out.printf("Subscriber removed from the list. %s%n", subscriber.getClass().getSimpleName());
    }
}
