package com.navr.dsa;

import java.util.*;

public class MyQueue {
    public static void main(String[] args) {
        q1();
    }

    private static void q1() {
        Queue<String> q1 = new LinkedList<>();
        q1.add("aaa");
        q1.add("ccc");
        q1.add("zzz");
        q1.add("bbb");
        System.out.println("q1="+q1);

        Queue<String> q2 = new PriorityQueue<>(Collections.reverseOrder());
        q2.add("A");
        q2.add("C");
        q2.add("F");
        q2.add("B");
        q2.add("E");
        q2.add("D");
        System.out.println("q2="+q2);


//        Stack<String> stk = new LinkedList<>();
    }
}
