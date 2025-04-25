package com.navr.learn.java17;


/**
 * <pre>
 *     Java 17 brings an improved version of the instanceof operator that both tests
 *     the parameter and assigns it to a binding variable of the proper type.
 *
 * </pre>
 */
public class EnhancedInstanceOf {
    public static void main(String[] args) {
        traditionalInstanceof("hello");
        traditionalInstanceof(123);
        traditionalInstanceof(500f);
        enhancedInstanceof("hello");
        enhancedInstanceof(123);
        enhancedInstanceof(500f);
    }

    private static void traditionalInstanceof(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.printf("traditionalInstanceof: obj instanceof String. %s%n", s);
        } else if (obj instanceof Integer) {
            Integer i = (Integer) obj;
            System.out.printf("traditionalInstanceof: obj instanceof Number. %d%n", i);
        } else {
            System.out.printf("traditionalInstanceof: obj instanceof unknown. %s%n", obj);
        }
    }

    private static void enhancedInstanceof(Object obj) {
        if (obj instanceof String s) {
            System.out.printf("enhancedInstanceof: obj instanceof String. %s%n", s);
        } else if (obj instanceof Integer i) {
            System.out.printf("enhancedInstanceof: obj instanceof Number. %d%n", i);
        } else {
            System.out.printf("enhancedInstanceof: obj instanceof unknown. %s%n", obj);
        }
    }
}
