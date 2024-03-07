package com.navr.learn.java8;

import com.navr.learn.java8.common.Person;
import com.navr.learn.java8.common.PersonHelper;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        streamMap();
    }


    private static void streamMap() {
        List<Person> personList = PersonHelper.getPersonList();

        // map and collect
        List<String> lastNamesList = personList.stream()
                .map(Person::getLastName)
                .collect(Collectors.toList());
        System.out.printf("lastNamesList=%s%n", lastNamesList);

        // map and collect
        Set<String> citySet = personList.stream()
                .map(Person::getCity)
                .collect(Collectors.toSet());
        System.out.printf("citySet=%s%n", citySet);

        // filter, map and collect
        // return a list of first names that starts with a specific char
        List<String> listOfFirstNamesThatStartsWith = personList.stream()
                .map(Person::getFirstName)
                .filter(firstName ->{return firstName.startsWith("S");})
                .collect(Collectors.toList());
        System.out.printf("listOfFirstNamesThatStartsWith=%s%n", listOfFirstNamesThatStartsWith);

        // map/transform and collect
        // combine firstName and lastName and return a list
        List<String> fullNameList = personList.stream()
                .map(person -> {return person.getFirstName()+" "+person.getLastName();})
                .collect(Collectors.toList());
        System.out.printf("fullNameList=%s%n", fullNameList);

        // map/transform and collect
        // fetch first few chars from each element and return a list
        Stream<String> s = Stream.of("apple", "banana", "orange");
        List<String> listOfFirstFewChars = s
                .map(s1 -> s1.substring(0, 2))
                .collect(Collectors.toList());
        System.out.printf("listOfFirstFewChars=%s%n", listOfFirstFewChars);

    }

}
