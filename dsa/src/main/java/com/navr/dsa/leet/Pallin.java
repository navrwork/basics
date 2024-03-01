package com.navr.dsa.leet;

import java.util.*;

public class Pallin {
    public static void main(String[] args) {
//        LocalDateTime dt1 = LocalDateTime.now();
//        long t1 = System.nanoTime();
//        isPalli_v2(8234567890000000006L);
//        long t2 = System.nanoTime();
//        LocalDateTime dt2 = LocalDateTime.now();
//        Duration d = Duration.between(dt1, dt2);
//        System.out.println("time: "+(t2-t1)+" ns, d="+d.getNano());


//        longestPalli();

//        longestPalliInString();

        int pow = (int) Math.log10(1234);
        System.out.printf("firstD=%d %n", (int)(1234/Math.pow(10,pow)));
    }


    private static boolean isPalli_v1(long num) {
        boolean isPalli = false;

        long num2 = num;
        long revNum = 0;
        int i=0;
        while (num2 > 0) {
            long digit = num2 % 10;
            revNum = revNum * 10 + digit;
//            System.out.println("digit="+digit+", revNum="+revNum);
            num2 /= 10;
            i++;
        }
        if (num==revNum) isPalli = true;
        return isPalli;
    }

    private static boolean isPalli_v2(long num) {
        boolean isPalli = false;
        StringBuilder sb = new StringBuilder(Long.toString(num));
        for (int i = 0, j=sb.length()-1; i <= sb.length()/2; i++, j--) {
            System.out.println("Compare "+sb.charAt(i)+" and "+sb.charAt(j));
            if(sb.charAt(i)!=sb.charAt(j)) {
                System.out.println("Non match found. "+sb.charAt(i)+"-"+sb.charAt(j));
                break;
            }
            if (i>=sb.length()/2){
                isPalli = true;
            }
        }
        System.out.println("num="+num+", isPalli="+isPalli);
        return isPalli;
    }

    private static boolean isPalli_v3(long num) {
        boolean isPalli = false;
        long tmpNum = num;
        while(tmpNum>0) {
            int laDistgit = (int) (tmpNum % 10);
            int powVal = (int)Math.log10(tmpNum);
            int firstDigit = (int)(tmpNum/Math.pow(10.0, powVal));
            System.out.printf("firstDigit=%d, lastDigit=%d%n", firstDigit, laDistgit);
            if (powVal!=laDistgit) {
                break;
            }


        }
        return isPalli;
    }

    private static String longestPalli() {
        StringBuilder sb = new StringBuilder("a");
        List<String> palliCount = new ArrayList<>();
        for (int i=0;i<=sb.length()-1;i++) {
            for (int j = sb.length(); j > i; j--) {
                StringBuilder sub = new StringBuilder(sb.substring(i,j));
                StringBuilder sub2 = new StringBuilder(sb.substring(i,j));
//                if (sub.length()>=2) {
                    StringBuilder rev = sub.reverse();
                    System.out.printf("sub2=%s, rev=%s%n", sub2, rev);
                    if (sub2.compareTo(rev) == 0) {
//                        System.out.printf("Palli found. rev=%s%n", rev);
                        palliCount.add(rev.toString());
                    }
//                }
            }
        }

        System.out.println(palliCount);
//        String largePalli = palliCount.get(0);
        Optional<String> largePalli = palliCount.stream().max(Comparator.comparingInt(String::length));
//        palliCount.stream().findFirst(
        System.out.println("largePalli="+largePalli.orElse(null));
        return largePalli.orElse(null);
    }

    private static String longestPalliInString() {
        String s = "helloracecars";
        int n = s.length();

        // If the string has less than 2 characters, it is already a palindrome
        if (n < 2) {
            return s;
        }

        // Initialize variables to track the longest palindrome substring
        String sub = s.substring(0, 1);
        int curr = 1;

        // Iterate through each character in the string
        for (int i = 0; i < n; i++) {

            // Check for palindromes with odd length
            int start = i, end = i;
            while (start >= 0 && end < n && s.charAt(start) == s.charAt(end)) {
//                System.out.printf("i==%s, start=%s, char=%s, end=%s, sub=%s, curr=%s %n", i, start, s.charAt(start), end, sub, curr);
                // If the current substring is longer than the previously recorded one,
                // update 'sub' and 'curr' accordingly
                if (end - start + 1 > curr) {
                    sub = s.substring(start, end + 1);
                    curr = end - start + 1;
                    System.out.printf("i==%s, start=%s, char=%s, end=%s, sub=%s, curr=%s %n", i, start, s.charAt(start), end, sub, curr);
                }
                // Expand the substring by moving the start and end pointers
                start--;
                end++;
            }

            // Check for palindromes with even length
            start = i;
            end = i + 1;
            while (start >= 0 && end < n && s.charAt(start) == s.charAt(end)) {
                // If the current substring is longer than the previously recorded one,
                // update 'sub' and 'curr' accordingly
                if (end - start + 1 > curr) {
                    sub = s.substring(start, end + 1);
                    curr = end - start + 1;
                    System.out.printf("i==%s, start=%s, char=%s, end=%s, sub=%s, curr=%s %n", i, start, s.charAt(start), end, sub, curr);
                }
                // Expand the substring by moving the start and end pointers
                start--;
                end++;
            }
        }
        System.out.println("sub --> "+sub);
        return sub;
    }
}
