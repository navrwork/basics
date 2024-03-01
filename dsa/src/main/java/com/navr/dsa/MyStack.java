package com.navr.dsa;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        reverseStr();
    }

    private static void reverseStr() {
        String s1 = "hello";
        Stack<Character> stack = new Stack<>();
        s1.chars().forEach(c->stack.push((char) c));
//        s1.chars().forEach(stack::push);
        StringBuilder sb2 = new StringBuilder();
        s1.chars().forEach(c->sb2.append(stack.pop()));
        System.out.println("s1="+s1+", sb2="+sb2);

    }
}
