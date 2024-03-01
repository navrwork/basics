package com.navr.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Regex {
    public static void main(String[] args) {
        regexLookAround();
        charCount();
        wordFrequencyCount();
        pattern2();
    }

    private static void regexLookAround() {
        String text = "Hello@World@This@Is@A@Java@Program";
        String[] s1 = text.split("@");
        System.out.println("s1="+ Arrays.toString(s1));

        String[] s2 = text.split("((?<=@))");
        System.out.println("s2="+ Arrays.toString(s2));

        String[] s3 = text.split("((?=@))|((?<=@))");
        System.out.println("s2="+ Arrays.toString(s3));

        System.out.println("\r\n#################");
    }

    private static void charCount() {
        String s = "hello, this is hell 007";
        long count = s.chars().filter(ch -> ch=='l').count();
        System.out.println("count="+count);

        // Count only chars. Exclude any non-char.
//        Pattern p = Pattern.compile("[a-zA-Z0-9]*");
//        Matcher m = p.matcher(s);
//        if (m.find()) {
//            String nonc = m.group();
//            System.out.println("nonc="+nonc);
//        }
        System.out.println("\r\n#################");
    }

    private static void wordFrequencyCount() {
        String s = "hell, this is hell. sure hell it is.";
        String w = "hell";
        String[] sArr = s.split("\\W+"); // split using non-word char
        System.out.println("sArr="+Arrays.toString(sArr));
        long wCount = Arrays.stream(sArr).filter(word->word.equals(w)).count();
        System.out.printf("s=%s, w=%s, wCount=%d",s,w,wCount);
//        System.out.println("\r\n#################");

        String[] arr = s.split("\\W+");
        System.out.println(Arrays.toString(arr));
        Stream<String> stream1 = Arrays.stream(arr);
        Map<String, Integer> countMap = new HashMap<>();
        stream1.forEach(wd->countMap.put(wd, countMap.getOrDefault(wd, 0)+1));
        System.out.println(countMap);
        System.out.println("\r\n#################");

    }

    private static void pattern1() {
        String s1 = "qqqAAAbbb@xyz.com";
        Pattern p1 = Pattern.compile("([a-z]|[A-Z])*@.*");
        Matcher m1 = p1.matcher(s1);
        System.out.println("s1="+s1+", matches="+m1.matches());

        //
        String s2 = "abc,mno,xyz,12345,98765";
        Pattern p2 = Pattern.compile(",");
        Matcher m2 = p2.matcher(s2);
        System.out.println("s2="+s2+", matches="+m2.matches());

        while (m2.find()) {
            System.out.println("group="+m2.group()+", m2.start="+m2.start()+", m2.end="+m2.end());
        }

        Stream<MatchResult> smr2 = m2.results();
        smr2.forEach(System.out::println);
        System.out.println("#################");
    }

    private static void pattern2() {
        String data = "This is a test String and 'This is data we want'";
        Pattern pattern = Pattern.compile("'(.*?)'");
        Matcher matcher = pattern.matcher(data);
        if (matcher.find()) {
            System.out.println(matcher.group(1));
        }

        System.out.println("");
        System.out.println("#################");
        System.out.println("");

        String data2 = "hello this is hello@xyz.com ... bye";
//        Pattern pattern2 = Pattern.compile(".*\\s+.*([a-z].*)@([a-z].*\\.[a-z].*)\\s+.*");
//        Pattern pattern2 = Pattern.compile("(?:\\w\\s)+([a-z].*@[a-z].*)");
        Pattern pattern2 = Pattern.compile("(\\w+)@(\\S+)");
        Matcher matcher2 = pattern2.matcher(data2);
        if (matcher2.find()) {
            System.out.println(matcher2.group(1));
            System.out.println(matcher2.group(2));
        }
    }
}
