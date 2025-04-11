package com.navr.learn.java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        functionTest();
        biFunctionTest();
        biFunctionAndThen();
    }

    private static void functionTest() {
        Function<Integer, Integer> funcTwoTimes = integer -> {
            return 2 * integer;
        }; // statement lambda
        int n = 10;
        int result = funcTwoTimes.apply(n);
        System.out.printf("functionTest funcTwoTimes: n=%d, result=%d%n", n, result);

        Function<Integer, Integer> funcTenTimes = integer -> 10 * integer; // expression lambda
        result = funcTenTimes.apply(n);
        System.out.printf("functionTest funcTenTimes: n=%d, result=%d%n", n, result);
    }

    private static void biFunctionTest() {
        BiFunction<Integer, Integer, Long> funcProduct = (n1, n2) -> {
            return (long) n1 * n2;
        };
        int n1 = 10;
        int n2 = 50;
        long result = funcProduct.apply(n1, n2);
        System.out.printf("biFunctionTest funcProduct: n1=%d, n2=%d, result=%d%n", n1, n2, result);

    }

    private static void biFunctionAndThen() {
        int number1 = 10, number2 = 20;

        BiFunction<Integer, Integer, Long> funcAddNumbers = (n1, n2) -> (long)n1+n2;
        Function<Long, Long>  funcTwoTimes = n -> 2*n;
        Function<Long, String> funcToHexString = Long::toHexString;

        String result = funcAddNumbers.andThen(funcTwoTimes).andThen(funcToHexString).apply(number1, number2);
        System.out.printf("biFunctionAndThen: number1=%d, number2=%d, result=%s%n", number1, number2, result);
    }
}
