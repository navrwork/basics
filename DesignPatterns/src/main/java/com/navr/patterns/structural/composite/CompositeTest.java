package com.navr.patterns.structural.composite;

/**
 * <b>Composite</b> is a structural design pattern that lets you compose objects into tree
 * structures and then work with these structures as if they were individual objects.
 *
 * <br/>
 * Reference: <a href="https://refactoring.guru/design-patterns/composite">Composite pattern</a>
 */
public class CompositeTest {

    public static void main(String[] args) {
        Part ram = new Part("RAM", 50);
        Part rom = new Part("SSD", 75);
        Part cpu = new Part("CPU", 90);
        Part monitor = new Part("Monitor", 60);
        Item computer = new Item("PC");
        computer.addPart(ram).addPart(rom).addPart(cpu).addPart(monitor);

        int computerPrice = computer.getPrice();
        System.out.printf("computerPrice=%d%n", computerPrice);
    }
}
