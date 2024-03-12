package com.navr.learn.java;

public class StringDemo {

    public static void main(String[] args) {
        string1();
    }

    private static void string1() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello").intern();

        System.out.printf("s1=%s, s2=%s, s3=%s, s4=%s%n", s1, s2, s3, s4);
        System.out.printf("s1==s2->%b, s1==s3->%b, s1==s4->%b%n", s1==s2, s1==s3, s1==s4);
        System.out.printf("s2==s3->%b, s2==s4->%b, s3==s4->%b%n", s2==s3, s2==s4, s3==s4);

    }
}
