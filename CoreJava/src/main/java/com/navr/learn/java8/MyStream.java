package com.navr.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class MyStream {
    public static void main(String[] args) {
//        streamInt();

        List<String> strList = Arrays.asList("abc", "hello", "xyz", "piano");
        groupListByLength(strList);
    }

    private static void streamInt() {
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        long allSum1 = numList.stream().mapToInt(Integer::intValue).sum();

        OptionalInt optMax = numList.stream().mapToInt(Integer::intValue).max();

//        long allSum2 = numList.stream().

        Integer sumNum = 0;
        long evenSum = numList.stream().filter( (n) -> n%2==0).mapToInt(Integer::intValue).sum();

        long oddSum = numList.stream().filter(n->n%2!=0).mapToInt(Integer::intValue).sum();

        System.out.printf("allSum1=%d, evenSum=%d, oddSum=%d", allSum1, evenSum, oddSum);
    }

    // group list of string values by their length
    // 3, ["abc", "xyz"]
    // 5, ["hello", "piano"]
    private static void groupListByLength(List<String> strList) {
        Map<Integer, List<String>> strGroupList = strList.stream().collect(Collectors.groupingBy(String::length));
        System.out.printf("strGroupList=%s%n", strGroupList);
    }
}
