package com.navr.dsa.leet;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {2,3,5,10};
        int w = 15;
        coinChangeCombinations(coins, w);
    }

    private static void coinChangeCombinations(int[] coins, int w) {
        int[][] a = new int[coins.length][w+1];
        for (int i=0; i< coins.length; i++) {
            for (int j=0; j<=w; j++) {
                if (j==0) {
                    a[i][j] = 1;
                    continue;
                }
                if (i==0 && j>0) {
                    if (j%coins[i]==0) {
                        a[i][j] = 1;
                    } else {
                        a[i][j] = 0;
                    }
                } else if (coins[i]>j) {
                    a[i][j] = a[i-1][j];
                } else {
                     int exclVal = a[i-1][j];
                     int inclVal = a[i][j-coins[i]];
                    a[i][j] = exclVal+inclVal;
                }
            }
        }
        printArray(a);
        int minSetSize = 0;
        int minSetIndex = 0;
        for (int i=0; i<a.length; i++) {
            minSetSize = Math.max(a[i].length, minSetSize);
            minSetIndex = i;
        }
        System.out.printf("minSet=%s %n", Arrays.toString(a[minSetIndex]));
    }

    private static void printArray(int[][] a) {
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[0].length; j++) {
                System.out.printf("%d  ", a[i][j]);
            }
            System.out.printf("%n");
        }
    }

}
