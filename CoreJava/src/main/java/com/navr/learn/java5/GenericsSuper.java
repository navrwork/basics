package com.navr.learn.java5;

import java.util.ArrayList;
import java.util.List;

/**
 * The use of the super keyword in Java generics enables specifying a <b>lower bound</b>
 * for the type parameter. It restricts the unknown type parameter to be a <b>specific type or a supertype</b> of that type.
 * <p>
 * The &lt;? super T&gt; syntax means that the list can be of type T or any superclass of T.
 * This is useful when you need to <b>add elements</b> to a collection, as it ensures that the collection
 * can hold objects of the specified type or its superclasses.
 * </p>
 */
public class GenericsSuper {
    public static void main(String[] args) {
        readGenericsSuper();
        writeGenericsSuper();
    }

    private static void readGenericsSuper() {
        List<Object> objList = List.of(1, 2);
        printIntegers(objList); // Ok. Object type is a super class of Integer.

        List<Number> numList = List.of(11, 22);
        printIntegers(numList); // Ok. Number type is a super class of Integer.

        List<Integer> intList = List.of(111, 222);
        printIntegers(intList); // Ok. Integer type.

        List<Double> doubleList = List.of(1.0, 2.0, 3.0);
        // Compilation error: 'printIntegers(java.util.List<? super java.lang.Integer>)' in 'com.navr.learn.java5.GenericsSuper' cannot be applied to '(java.util.List<java.lang.Double>)'
//        printIntegers(doubleList); // NOT Ok. Double not a super class of Integer.
    }

    private static void printIntegers(List<? super Integer> intList) {
        for (Object o : intList) { // Element read from the list will ALWAYS be of 'Object' type. Explicit casting required for a specific type.
            if (o instanceof Integer i) {
                System.out.printf("printIntegers: i=%d%n", i);
            } else if (o instanceof Number n) {
                System.out.printf("printIntegers: n=%s%n", n);
            } else if (o != null) {
                System.out.printf("printIntegers: o=%s%n", o);
            }
        }
    }

    private static void writeGenericsSuper() {
        System.out.println("\n ## writeGenericsSuper() ##");
        List<Number> numberList = new ArrayList<>();
        numberList.add(100);
        System.out.printf("writeGenericsSuper: numberList (before): %s%n", numberList);
        addIntegers(numberList);
        System.out.printf("writeGenericsSuper: numberList (after): %s%n", numberList);
    }

    private static void addIntegers(List<? super Integer> intList) {
        intList.add(111);
        intList.add(222);
    }
}
