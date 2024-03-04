package com.navr.learn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

    public static void main(String[] args) {
        patternMatcher1();
        patternMatcher2();
        patternMatcher3();
        patternMatcher4();
        replaceWithPatternMatcher("hello friends. Let's  play  now.");
    }

    private static void patternMatcher1() {
        String regex = "abc";
        String input1 = "hello abc!";
        String input2 = "abc";
        System.out.printf("%npatternMatcher1: regex=%s, input1=%s, input2=%s%n", regex, input1, input2);
        Pattern pat = Pattern.compile(regex);
        boolean find1 = pat.matcher(input1).find(); // true
        boolean find2 = pat.matcher(input1).find(); // true
        boolean matches1 = pat.matcher(input1).matches(); // FALSE
        boolean matches2 = pat.matcher(input2).matches(); // true
        System.out.printf("find1=%b, find2=%b%n", find1, find2);
        System.out.printf("matches1=%b, matches2=%b%n", matches1, matches2);
    }

    private static void patternMatcher2() {
        String regex = "abc";
        String input = "Hi abc. Hello abc!!";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(input);
        System.out.printf("%npatternMatcher2: regex=%s, input=%s%n", regex, input);

        while (mat.find()) {
            int startIndex = mat.start();
            int endIndex = mat.end();
            String subSeq = mat.group();
            System.out.printf("startIndex=%d, endIndex=%d, subSeq=%s%n", startIndex, endIndex, subSeq);
        }
    }

    private static void patternMatcher3() {
        String regex = "a.c";
        String input = "Hi abc. Hello abc!!";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(input);
        System.out.printf("%npatternMatcher3: regex=%s, input=%s%n", regex, input);

        while (mat.find()) {
            int startIndex = mat.start();
            int endIndex = mat.end();
            String subSeq = mat.group();
            System.out.printf("startIndex=%d, endIndex=%d, subSeq=%s%n", startIndex, endIndex, subSeq);
        }
    }

    private static void patternMatcher4() {
        String regex1 = "(\\s+)";
        String regex2 = "(\\w+)";
        String input = "Hello. I'm an apple. That's a banana.";

        System.out.printf("%npatternMatcher4: regex1=%s, input=%s%n", regex1, input);

        Pattern p = Pattern.compile(regex1);
        Matcher m = p.matcher(input);
        while (m.find()) {
            int groupCount = m.groupCount();
            String grp0 = m.group(0);
            String grp1 = m.group(1);
            System.out.printf("Match found. grp0=%s, grp1=%s, groupCount=%d%n", grp0, grp1, groupCount);
        }

        p = Pattern.compile(regex2);
        m = p.matcher(input);
        while (m.find()) {
            int groupCount = m.groupCount();
            String grp0 = m.group(0);
            String grp1 = m.group(1);
            System.out.printf("Match found. grp0=%s, grp1=%s, groupCount=%d%n", grp0, grp1, groupCount);
        }

    }

    private static String replaceWithPatternMatcher(String inStr) {
        String outStr = null;
        Pattern p = Pattern.compile("\\s+");
        Matcher m = p.matcher(inStr);
        outStr = m.replaceAll("\t");
        System.out.printf("%nreplaceWithPatternMatcher: inStr=%s, outStr=%s%n", inStr, outStr);

        return outStr;
    }
}
