package com.navr.patterns.creational.builder;

/**
 * Builder is a creational design pattern that lets you construct complex objects step by step.
 * The pattern allows you to produce different types and representations of an object using the same construction code.
 *
 * <br/>
 * Reference: <a href="https://refactoring.guru/design-patterns/builder">Builder pattern</a>
 */
public class ApartmentBuilderTest {

    public static void main(String[] args) {

        Apartment apartment1 = new ApartmentBuilder().city("Mumbai").zipcode("200001")
                .sqm(3000).numOfRooms(4).doorNum(1001).build();

        Apartment apartment2 = new ApartmentBuilder().city("Chennai").zipcode("600001")
                .sqm(2000).numOfRooms(3).doorNum(101).build();

        System.out.printf("apartment1=%s%n", apartment1.toString());
        System.out.printf("apartment2=%s%n", apartment2.toString());
    }
}
