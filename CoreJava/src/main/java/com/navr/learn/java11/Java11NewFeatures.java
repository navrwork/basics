package com.navr.learn.java11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Java 11 new features: New utility methods in String class.
 * <br/><br/>
 * Reference:
 * <a href="https://www.baeldung.com/java-11-new-features">Java 11 New Features | baeldung.com</a>
 */
public class Java11NewFeatures {
    public static void main(String[] args) {

        newStringMethods();

        newCollectionMethods();

        newLambdaFeatures();
    }

    private static void newStringMethods() {
        //
        // isBlank() - This instance method returns a boolean value.
        // Empty Strings and Strings with only white spaces are treated as blank.
        //
        System.out.printf("\"\".isBlank()->%s%n", "".isBlank()); //true
        System.out.printf("\"   \".isBlank()->%s%n", "   ".isBlank()); // true

        //
        // lines() method returns a stream of strings, which is a collection of all
        // substrings split by lines.
        //
        String str = "AB\nCD\nEF";
        System.out.printf("str=%s%n", str);
        System.out.printf("str.lines()=%s%n", str.lines().collect(Collectors.toList()));

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

    private static void newCollectionMethods() {
        List<String> strList = Arrays.asList("hello", "world");
        System.out.printf("strList: %s%n", strList);

        String[] strArray = strList.toArray(String[]::new);
        System.out.printf("strArray: %s%n", Arrays.toString(strArray));
    }

    private static void newLambdaFeatures() {
        List<String> sampleList = Arrays.asList("Hello", "World");
        String resultString = sampleList.stream()
                // Local var supports annotations like: (@Nonnull var x)
                .map((var x) -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.printf("%nsampleList=%s%n", sampleList);
        System.out.printf("resultString=%s%n", resultString);
    }
}
