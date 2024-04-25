package com.navr.patterns.creational.factorymethod.v2;

/**
 * <b>Factory Method</b> is a creational design pattern that provides an interface for
 * creating objects in a superclass, but allows subclasses to alter the type of
 * objects that will be created.
 *
 *  <br/> <br/>
 *  Reference:
 *  <ul>
 *  <li><a href="https://refactoring.guru/design-patterns/factory-method">factory-method (refactoring.guru)</a></li>
 *  <li><a href="https://stackoverflow.com/a/13030163/291475">stackoverflow.com #1</a></li>
 *  <li><a href="https://stackoverflow.com/a/65331902/291475">stackoverflow.com #2</a></li>
 *  </ul>
 *
 */
public class LogisticsTest {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        deliverItems(logistics);
        logistics = new SeaLogistics();
        deliverItems(logistics);
    }

    private static void deliverItems(Logistics logistics) {
        Transport transport = logistics.createTransport();
        transport.deliver();
    }
}
