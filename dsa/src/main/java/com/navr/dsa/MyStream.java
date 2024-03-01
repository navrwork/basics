package com.navr.dsa;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStream {
    public static void main(String[] args) {
//        stream1();
//        removeDupeChars("Apple");
//        mapCount();
//        numTest();
//        toUpper();
        maxLen();
    }

    private static void stream1() {
        List<Integer> inList = Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> inStream = inList.stream();
        List<Integer> out = new ArrayList<>();
//        inStream.forEach(i -> out.add(i*2));
//        List<Integer> filteredList = inStream.filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println("filtList="+filteredList);
//        Stream<Integer> outStream = out.stream();
//        outStream.forEach(System.out::println);

        Optional<Integer> i2 = inStream.filter(i->i%7==0).findFirst();
//        System.out.println("i2="+i2.orElse(-1));
        System.out.println("i2="+i2.get());
        Stream<Integer> outStream2 = out.stream();
        List<Integer> outList = new ArrayList<>();
        outStream2.forEach(outList::add);
        System.out.println("outList="+outList);

//        Consumer<String> printConsumer = s -> { System.out::println };
//        Consumer<String> consumer = s -> { System.out::println };
//        System.out.println(out);
    }
    private static void removeDupeChars(String str) {
        HashSet<Character> charSet = new LinkedHashSet<>();
        String out = null;
        StringBuffer sb = new StringBuffer();
        if (str!=null) {
//            str.chars().forEach(i->charSet.add((char)i));
            str.chars().forEach(i-> { if (charSet.add((char)i)) sb.append((char)i); });
            out = charSet.toString();
            System.out.println("sb="+sb);

            // V2
            Stream<char[]> chStream = Stream.of(str.toCharArray());
            chStream.forEach(System.out::println);
        }
    }

    private static void mapCount() {
        Stream<String> sStream = Stream.of("aaa", "bbb", "aaa", "bbb", "bbb");
        Map<String, Integer> mapCount = new HashMap<>();
        sStream.forEach(s->{mapCount.put(s, mapCount.getOrDefault(s,0)+1);});
        System.out.println(mapCount);
    }

    private static void numTest() {
        Stream<Integer> iStream = Stream.of(1,2,3,4,5);
        Consumer<Integer> iCons = i -> {
            System.out.println(i*2);
        };
        iStream.forEach(iCons);



    }

    private static void toUpper() {
        Stream<String> sStream = Stream.of("hello", "welcome", "bye");
//        Consumer cons2 = s -> {
//          StringBuilder sb = new StringBuilder();
//            ((String)s.)
//        };
        List<String> upStrList = sStream.map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upStrList);

        String s2 = "hey good morning all";
        Stream<String> sStream2 = Arrays.stream(s2.split(" "));
        String upStr = sStream2.map(String::toUpperCase).collect(Collectors.joining(","));
    }

    private static void maxLen() {
        Stream<String> ss = Stream.of("aaaa", "abcdef", "hello", "nothing", "abracadabra");
        Optional<String> oStr = ss.max(Comparator.comparingInt(String::length));
        System.out.println("oStr="+oStr.orElse(null));

    }
}
