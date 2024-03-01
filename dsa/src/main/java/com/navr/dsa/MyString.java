package com.navr.dsa;

import java.util.*;

public class MyString {
    static public void main(String[] args) {
//        s1();
//        wordCount(3);
//        reverseString();
//        reverseWords("  hello world  ");

//        findPermutations("abc");

        findLongestSubstring("aabcdabc");
    }

    static private  void s1() {
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = new String("hello").intern();
        String s4 = new String("hello").intern();
        System.out.println("s1==s2 "+(s1==s2));
        System.out.println("s3==s4 "+(s3==s4));
    }

    private static void wordCount(int topX) {
        String str = "hi, this is hello. hello, this is hi. hi hi hi. another this hi. Have a nice day. ";
        List<String> strList = Arrays.asList(str.split("\\W+"));
        Map<String, Integer> sCountMap = new HashMap<>();
        strList.forEach(s->{sCountMap.put(s,sCountMap.getOrDefault(s,0)+1);});
        System.out.println("sCountMap="+sCountMap);

        Set<Map.Entry<String, Integer>> entrySet = sCountMap.entrySet();
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
        System.out.println("before_sort: entryList="+entryList);
//        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
//        entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o2.getValue()-o1.getValue();
//            }
//        });

//        Collections.sort(entryList, (o1,o2)->o2.getValue().compareTo(o1.getValue()));
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        List<Map.Entry<String, Integer>> topxList = entryList.subList(0,topX);
        System.out.println("after_sort: entryList="+entryList);
        System.out.println("topxList="+topxList);
    }

    private static void reverseString() {
        String s1 = "abc";
        StringBuffer sb1 = new StringBuffer();
//        System.out.println("rev: "+sb1.reverse());

        s1.chars().forEach(i->sb1.append(((char)(int) i)));
        System.out.println("sb1="+sb1);

//        s1.chars().forEach(c->sb1.append(c.));

        Stack<Integer> stk = new Stack<>();
        s1.chars().forEach(stk::push);
        StringBuilder sb2 = new StringBuilder();
        s1.chars().forEach(c->sb2.append((char)stk.pop().intValue()));
        System.out.println("s1="+s1+", sb2="+sb2);
    }

    private static String reverseWords(String words) {
        StringBuilder revWords = new StringBuilder();
        String words2 = words.strip();
        String[] wordsArr = words2.split("\\W+");
        Stack<String> revStack = new Stack<>();
        Arrays.stream(wordsArr).forEach(revStack::push);
        int stackSize = revStack.size();
        System.out.println("stackSize="+stackSize+", wordsArr.len="+wordsArr.length);
        for(int i = 0; i<stackSize; i++) {
            String popStr = revStack.pop();
            revWords.append(popStr);
            if (i<stackSize-1) {
                revWords.append(" ");
            }
        }
//        revStack.forEach(w->revWords.append(revStack.pop()));
        System.out.println("words="+words2+", revWords="+revWords);
        return revWords.toString();
    }

    public static void findPermutations(String str) {
        System.out.printf("** findPermutations(%s) **%n", str);
        //permut("", str, str.length());
//        printPermutn(str, "");
        permuteWithBacktracking(str, 0, str.length()-1);
    }

    public static void permut(String prefix, String s, int len) {
        System.out.printf("permut(%s, %s, %d)%n", prefix, s, len);
        if (prefix.length()==len) {
            System.out.printf("permut: max len reached. prefix=%s%n", prefix);
            return;
        }

        for (int i=0; i < s.length(); i++) {
            prefix = prefix + Character.toString(s.charAt(i));
            permut(prefix, s.substring(0,i)+s.substring(i+1), len);
        }
    }

    // Function to print all the permutations of str
    static void printPermutn(String str, String ans) {
        System.out.printf("printPermutn(%s, %s)%n", str, ans);
        // If string is empty
        if (str.isEmpty()) {
            System.out.printf("permutation found: %s%n", ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            printPermutn(ros, ans + ch);
        }
    }

    /**
     * https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
     *
     */
    private static void permuteWithBacktracking(String str, int l, int r) {
        System.out.printf("permute(%s, %d, %d)%n", str, l, r);
        if (l == r)
            System.out.printf("gotcha. permutation -> %s%n", str);
        else {
            for (int i = l; i <= r; i++) {
                if (l!=i) {
                    str = swap(str, l, i);
                    System.out.printf(".swap(%s, %d, %d) complete. %n", str, l, i);
                }

//                System.out.printf("before: i=%d, permute(%s, %d, %d)%n", i, str, l+1, r);
                permuteWithBacktracking(str, l + 1, r);
                if (l!=i) {
                    str = swap(str, l, i);
                    System.out.printf("..swap(%s, %d, %d) complete. i=%d %n%n", str, l, i, i);
                }

            }
        }
    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    /*
     * Sliding Window algorithm
     *
     * Find the Longest Substring Without Repeating Characters
     *
     */
    public static void findLongestSubstring(String str) {
        int maxLen = 0;
        String maxStr = null;
        int left = 0;
        int right = 1;
        Set<Character> substrSet = new LinkedHashSet<>();
        substrSet.add(str.charAt(left));
        while (right < str.length()) {
            char rightChar = str.charAt(right);
            if (substrSet.contains(rightChar)) {
                System.out.printf("dup char found. left=%d, right=%d, char=%s%n", left, right, rightChar);
                // char already exists. slide the window until the duplicate char is removed.
                boolean hasDuplicate = true;
                while(hasDuplicate) {
                    if (str.substring(left, right).contains(Character.toString(rightChar))) {
                        // dup is still present. slide further.
                        substrSet.remove(str.charAt(left));
                        left++;
                    } else {
                        hasDuplicate = false;
                        substrSet.add(rightChar);
                    }
                }
                right++;
            } else {
                System.out.printf("NO dup. char=%s, left=%d, right=%d, set=%s%n", str.charAt(right), left, right, substrSet);
                // no dup detected.
                if (right-left+1 > maxLen) {
                    maxStr = str.substring(left, right+1);
                    maxLen = maxStr.length();
                    System.out.printf("New max str detected. maxLen=%d, maxStr=%s%n", maxLen, maxStr);
                }
                substrSet.add(str.charAt(right));
                right++;
            }
            System.out.printf("left=%d, right=%d, substrSet=%s, maxLen=%d, maxStr=%s%n",
                    left, right, substrSet, maxLen, maxStr);
        }
    }
}
