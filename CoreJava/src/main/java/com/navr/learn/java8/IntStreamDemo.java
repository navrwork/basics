package com.navr.learn.java8;

import java.util.Arrays;
import java.util.List;

public class IntStreamDemo {
    public static void main(String[] args) {
        mapToInt();
    }

    private static void mapToInt() {
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        long numListSum = numList.stream().mapToInt(Integer::intValue).sum();

        long numListCount = numList.stream().mapToInt(Integer::intValue).count();

        long numListMax = numList.stream().mapToInt(Integer::intValue).max().orElse(0);

        double numListAverage = numList.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        System.out.printf("mapToInt: numListSum=%d, numListCount=%d, numListMax=%d, numListAverage=%f%n",
                numListSum, numListCount, numListMax, numListAverage);

//        long allSum2 = numList.stream().

        Integer sumNum = 0;
        long evenSum = numList.stream().filter( (n) -> n%2==0).mapToInt(Integer::intValue).sum();

        long oddSum = numList.stream().filter(n->n%2!=0).mapToInt(Integer::intValue).sum();

        System.out.printf("%nevenSum=%d, oddSum=%d", evenSum, oddSum);
    }
}
