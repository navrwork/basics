package com.navr.learn.java11;

import java.util.stream.Collectors;

/**
 * Java 11 new features: New utility methods in String class
 *
 */
public class StringMain {
    public static void main(String[] args) {

        newStringMethods();
    }

    private static void newStringMethods() {
        //
        // isBlank() - This instance method returns a boolean value.
        // Empty Strings and Strings with only white spaces are treated as blank.
        //
        System.out.println("".isBlank()); //true

        System.out.println("   ".isBlank()); // true

        //
        // lines() method returns a stream of strings, which is a collection of all
        // substrings split by lines.
        //
        String str = "AB\nCD\nEF";
        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList()));

        //
        // strip methods
        //
        String str2 = " abcd ";
        System.out.printf("%nstr='%s'%n", str2);
        System.out.printf("strip: '%s'%n", str2.strip());
        System.out.printf("stripLeading: '%s'%n", str2.stripLeading());
        System.out.printf("stripTrailing: '%s'%n", str2.stripTrailing());

        //
        // repeat(int) The repeat method simply repeats the string that many numbers of times
        //
        String strRepeat = "abc$".repeat(2);
        System.out.printf("%nstrRepeat=%s%n", strRepeat);
    }
}
