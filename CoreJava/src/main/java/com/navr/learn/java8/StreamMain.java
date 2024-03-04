package com.navr.learn.java8;

import com.navr.learn.java8.common.Fruit;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<Fruit> listOfFruits = Arrays.asList(
                new Fruit("Apple", 1),
                new Fruit("Apple", 3),
                new Fruit("Banana", 2),
                new Fruit("Banana", 2),
                new Fruit("Banana", 5),
                new Fruit("Pear", 0),
                new Fruit("Orange", 4)
        );

        //streamsGroupingBy(listOfFruits);
        streamsMap(listOfFruits);
    }

    private static void streamsGroupingBy(List<Fruit> listOfFruits) {

        // grouping of objects by one field
        Map<String, List<Fruit>> fruitGroupByOneField = listOfFruits.stream()
                .collect(Collectors.groupingBy(Fruit::getName));
        System.out.printf("fruitGroupByOneField=%s%n", fruitGroupByOneField);


        // grouping of objects by multiple fields
        Map<String, Map<Integer, List<Fruit>>> fruitGroupByTwoFields = listOfFruits.stream()
                .collect(Collectors.groupingBy(Fruit::getName, Collectors.groupingBy(Fruit::getAmount))
        );
        System.out.printf("fruitGroupByTwoFields=%s%n", fruitGroupByTwoFields);


        // grouping and count
        Map<String, Long> fruitGroupAndCount = listOfFruits.stream()
                .collect(Collectors.groupingBy(Fruit::getName, Collectors.counting()));
        System.out.printf("fruitGroupAndCount=%s%n", fruitGroupAndCount);


        // grouping and average
       Map<String, Double> fruitGroupAndAvg = listOfFruits.stream()
               .collect(Collectors.groupingBy(Fruit::getName, Collectors.averagingDouble(Fruit::getAmount)));
        System.out.printf("fruitGroupAndAvg=%s%n", fruitGroupAndAvg);

        // grouping and filtering
//        Map<String, Integer> fruitGroupFilterAndCount = listOfFruits.stream()
//                .collect(Collectors.groupingBy(
//                        Fruit::getName,
//                        Collectors.filtering(fruit -> fruit.getName().startsWith("A") || fruit.getName().startsWith("B")), Collectors.toList());


        // group list of string values by their length
        // 3, ["abc", "xyz"]
        // 5, ["hello", "piano"]
        List<String> strList = Arrays.asList("abc", "hello", "xyz", "piano");
        Map<Integer, List<String>> strGroupList = strList.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.printf("strGroupList=%s%n", strGroupList);


        // grouping with filter. return count.
        Map<String, Long> fruitFilterGroupAndCount = listOfFruits.stream()
                .filter(fruit -> fruit.getAmount()>1 && fruit.getAmount()<5)
                .collect(Collectors.groupingBy(Fruit::getName, Collectors.counting()));
        System.out.printf("fruitFilterGroupAndCount=%s%n", fruitFilterGroupAndCount);


        // grouping with filter. return obj list.
        Map<String, List<Fruit>> fruitFilterGroupAndObj = listOfFruits.stream()
                .filter(fruit -> fruit.getAmount()>1 && fruit.getAmount()<5)
                .collect(Collectors.groupingBy(Fruit::getName, Collectors.toList()));
        System.out.printf("fruitFilterGroupAndObj=%s%n", fruitFilterGroupAndObj);
    }

    private static void streamsMap(List<Fruit> listOfFruits) {

        List<Fruit> newFruitList = listOfFruits.stream().map(p->{p.setAmount(p.getAmount()*2); return p;})
                .collect(Collectors.toList());
        System.out.printf("newFruitList=%s%n", newFruitList);

    }

    private static void streamsReduce() {

    }

}
