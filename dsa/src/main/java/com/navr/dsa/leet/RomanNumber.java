package com.navr.dsa.leet;

import java.util.*;

public class RomanNumber {

    private static Map<Integer, String>  intToRomanMap = new LinkedHashMap<>();
    private static Map<String, Integer>  romanToIntMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        // Int Roman number mapping
        initMap();

//        int numValue = 2023;
//        String romanValue = intToRoman(numValue);
//        System.out.printf("numValue=%d, romanValue=%s%n", numValue, romanValue);

        String romanVal = "MMMCMXCIX";
        int intValue = romanToInt(romanVal);
        System.out.printf("romanVal=%s, intValue=%d%n", romanVal, intValue);
    }

    private static String intToRoman(int num) {
        String rValue = null;
        int tNum = num;
        if (intToRomanMap.containsKey(num)) {
            rValue = intToRomanMap.get(num);
        } else {
            StringBuilder sb = new StringBuilder();
            for(Map.Entry <Integer, String> e : intToRomanMap.entrySet()){
                while (tNum >= e.getKey()) {
                    int nearNum = e.getKey();
//                    System.out.printf("tNum=%d, nearNum=%s, rNum=%s%n", tNum, nearNum, e.getValue() );
                    tNum -= nearNum;
                    sb.append(e.getValue());
                }
                System.out.println("sb="+sb.toString());
            }
            rValue = sb.toString();
        }
        return rValue;
    }

    private static int romanToInt(String romanNum) {
        int result = 0;
        char[] charArray = romanNum.toCharArray();
        int strLen = romanNum.length();
        for (int i=0; i<strLen; i++) {
            if (i<strLen-1 &&
                    romanToIntMap.get(Character.toString(charArray[i]))<romanToIntMap.get(Character.toString(charArray[i+1]))) {
                result -= romanToIntMap.get(Character.toString(charArray[i]));
            } else {
                result += romanToIntMap.get(Character.toString(charArray[i]));
            }
            System.out.printf("result=%d%n",result);
        }
        return result;
    }
    private static void initMap(){
        intToRomanMap.put(1000, "M");
        intToRomanMap.put(900, "CM");
        intToRomanMap.put(500, "D");
        intToRomanMap.put(400, "CD");
        intToRomanMap.put(100, "C");
        intToRomanMap.put(90, "XC");
        intToRomanMap.put(50, "L");
        intToRomanMap.put(40, "XL");
        intToRomanMap.put(10, "X");
        intToRomanMap.put(9, "IX");
        intToRomanMap.put(5, "V");
        intToRomanMap.put(4, "IV");
        intToRomanMap.put(1, "I");

        romanToIntMap.put("M", 1000 );
        romanToIntMap.put("D", 500);
        romanToIntMap.put("C", 100);
        romanToIntMap.put("L", 50);
        romanToIntMap.put("X", 10);
        romanToIntMap.put("V", 5);
        romanToIntMap.put("I", 1);

        System.out.printf("intToRomanMap.entrySet --> %s%n", intToRomanMap.entrySet());
        System.out.printf("romanToIntMap.entrySet --> %s%n", romanToIntMap.entrySet());
    }
}
