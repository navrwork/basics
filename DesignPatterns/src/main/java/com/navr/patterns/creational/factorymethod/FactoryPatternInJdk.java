package com.navr.patterns.creational.factorymethod;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.Calendar;

/**
 *
 * <br/><b>Factory</b>
 * <ul>
 * <li>Creates objects without exposing the instantiation logic to the client
 * and refers to the newly created object through a common interface.
 * Is a simplified version of Factory Method.</li>
 * <li>Factory is "fixed", in that you have just one implementation with no subclassing.</li>
 * </ul>
 *
 * <br/><b>Factory Method</b>
 * <ul>
 *  <li>Define an interface for creating an object, but let subclasses decide which class to instantiate.
 *  Factory Method lets a class defer instantiation to subclasses.</li>
 *  <li>Factory Method is a creational design pattern that provides an interface for
 * creating objects in a superclass, but allows subclasses (client) to alter the type of
 * objects that will be created.</li>
 * <li>Factory method is generally used when you have some generic processing in a class,
 * but want to vary which kind of object you actually use.</li>
 * </ul>
 *
 * <br/> <br/>
 * Reference:
 * <ul>
 * <li><a href="https://refactoring.guru/design-patterns/factory-method">factory-method (refactoring.guru)</a></li>
 * <li><a href="https://stackoverflow.com/a/13030163/291475">stackoverflow.com #1</a></li>
 * <li><a href="https://stackoverflow.com/a/65331902/291475">stackoverflow.com #2</a></li>
 * </ul>
 *
 */
public class FactoryPatternInJdk {

    public static void main(String[] args) throws Exception {



    }

    private static void factoryMethodPattern() throws ParserConfigurationException {
        // java.util.Calendar#getInstance()
        Calendar cal = Calendar.getInstance();
        System.out.println("Calendar instance: " + cal.getClass().getCanonicalName());

        DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        System.out.println("DocumentBuilder instance: " + docBuilder.getClass().getCanonicalName());
    }

    private static void factoryPattern() {

    }
}
