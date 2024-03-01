package com.navr.dsa;

public class Backtracking {

    private static int recCounter = 0;
    private static void printPermutation(String str, String perm) {
        System.out.printf("printPermutation(%s, %s)%n", str, perm);
        if (str.isEmpty()) {
            System.out.println("perm="+perm);
            return;
        }

        for (int i=0; i<str.length(); i++) {
            System.out.printf("%n FOR loop .. i=%d: str=%s, perm=%s .. ", i, str, perm);
            String p = perm + str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            System.out.printf(".. newStr=%s, p=%s%n", newStr, p);
            printPermutation(newStr, p);
        }

    }
    public static void main(String[] args) {
        printPermutation("ABC", "");
    }
}
