package com.navr.dsa;

import java.util.*;

public class MyArray {

    public static void main(String[] a) {
//        findAllSubsets_1();


//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        twoSumUsingTwoPointer(arr, 13);


//        int[] arr4 = {1,2,3,4,5,6,7,8,9,10};
//        twoSumUsingHashMap(arr4, 9);

//        int[] arr2 = {1,1,0,0,1,1,1,0,1,1,1,1};
//        countMaxConsecutive(arr2);

//        int[] arr3 = {1,1,2,3,3,3,4,5,6,6};
//        removeDuplicates(arr3);

//        int[] arr5 = {1,2,3,4};
//        listAllSubSequences(arr5);
//
//        int[] arr6 = {1,2,3,4,5};
//        sumOfSubsequence(arr6, 5);
//
//        int[] arr7 = {1,2,3,4,5};
//        countOfSubsequence(arr7, 5);

        int[] arr8 = {1,2,3,4,5,6,7};
//        subarraySum(arr8, 9);

        kth_Largest_MaxHeap(arr8, 3);
    }

    private static void findAllSubsets_1() {
        int[] inArr = {10,20,30,40};
        int powsetSize = (int)Math.pow(2, inArr.length); // size=2^n
//        System.out.println("inArr="+ Arrays.toString(inArr)+", powsetSize="+powsetSize);

        int loopLimit = (1<<inArr.length);
//        System.out.println("loopLimit="+loopLimit);
//        for (int i=0; i < powsetSize; i++) {
//            System.out.println("i="+i+", bin="+Integer.toBinaryString(i));
//        }
        /*for (int i=0; i<inArr.length; i++) {
            for (int j=i+1; j<inArr.length; j++) {

            }
        }*/

//        for (int i=0; i<inArr.length; i++) {
//            System.out.println((1 << i));
//        }

        for (int i = 0; i < powsetSize; i++)
        {
            System.out.print("{ ");

            // Print current subset
            for (int j = 0; j < inArr.length; j++) {

//                System.out.print("i="+i+", j="+j+", "+(i & (1 << j))+" ");

                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i & (1 << j)) > 0)
                    System.out.print(inArr[j] + " ");
            }

            System.out.println("}");
        }

    }

    private static void twoSumUsingTwoPointer(int[] arr, int sum) {
        int ptr1 = 0;
        int ptr2 = arr.length - 1;
        boolean gotTwoSum = false;
        while (ptr1 < ptr2) {
            System.out.printf("arr[ptr1]=%d, arr[ptr2]=%s%n", arr[ptr1], arr[ptr2]);
            if (arr[ptr1]+arr[ptr2]==sum) {
                System.out.printf("gotcha .. target=%d, num1=%d, num2=%d%n", sum, arr[ptr1], arr[ptr2]);
                gotTwoSum = true;
                break;
            } else if (arr[ptr1]+arr[ptr2]>sum) {
                ptr2--;
            } else {
                ptr1++;
            }
        }
        if (!gotTwoSum) {
            System.out.println("twoSum not found!");
        }
    }

    private static boolean twoSumUsingHashMap(int[] arr, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            int otherNum = sum - arr[i];
            if (map.containsKey(otherNum)) {
                System.out.printf("gotcha. num1=%d, num2=%d%n", arr[i], otherNum);
                return true;
            } else {
                map.put(arr[i], i);
            }
        }
        return false;
    }

    /**
     * Given an array of N + 1 size, where each element is between 1 and N.
     * Assuming there is only one duplicate number, your task is to find the duplicate number.
     */
    private static int findDuplicate(int[] arr) {
        int dupElement = 0;
        int[] freq = new int[arr.length+1];
        for (int element : arr) {
            if (freq[element]==0) {
                freq[element] = 1;
            } else {
                dupElement = element;
                break;
            }
        }
        System.out.printf("findDuplicate: dupElement=%d%n", dupElement);
        return dupElement;
    }

    /**
     * Problem Statement: Given an array that contains only 1 and 0
     * return the count of maximum consecutive ones in the array.
     *
     * @param arr
     * @return
     */
    public static int countMaxConsecutive(int[] arr) {
        int maxCount = 0;
        int tmpCount = 0;
        for (int i : arr) {
            if (i==1) {
                tmpCount++;
                if (tmpCount>maxCount) {
                    maxCount = tmpCount;
                }
            } else {
                tmpCount = 0;
            }
        }
        System.out.println("In Array: "+Arrays.toString(arr)+", maxCount="+maxCount);
        return maxCount;
    }

    /**
     * Given an integer array sorted in non-decreasing order, remove the duplicates
     * in place such that each unique element appears only once.
     * The relative order of the elements should be kept the same.
     */
    public static void removeDuplicates(int[] arr) {
        int p1 = 0;
        int p2 = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[p1]!=arr[p2]) {
                p1++;
                arr[p1] = arr[p2];
            }
            p2++;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void listAllPermutations(int[] arr) {

    }

    public static void listAllSubSequences(int[] arr) {
        ArrayList<Integer> ds = new ArrayList<>();
        subseqList(0, new ArrayList<>(), arr, arr.length);
    }

    public static void subseqList(int index, ArrayList<Integer> ds, int[] arr, int n) {
        if (index==n) {
            System.out.println("ds -> "+ds.toString());
//            if (ds.isEmpty()) {
//                System.out.println("{}");
//            }
            return;
        }
        // take or pick the index into subsequence -- left sub tree
        ds.add(arr[index]);
        subseqList(index+1, ds, arr, n);

        // not pick. this element is not added into your subsequence. -- right sub tree
        ds.remove(ds.size()-1);
        subseqList(index+1, ds, arr, n);
    }

    public static void sumOfSubsequence(int[] arr, int sum) {
        subseqSum(0, new ArrayList<>(), 0, sum, arr, arr.length);
    }

    public static void subseqSum(int index, ArrayList<Integer> ds, int s, int sum, int[] arr, int n) {
        if (index==n) {
            if (s==sum) {
                System.out.printf("subseqSum: sum=%d, ds->%s%n", sum, ds.toString());
            }
            return;
        }

        ds.add(arr[index]);
        s += arr[index];
        subseqSum(index+1, ds, s, sum, arr, n);

        ds.remove(ds.size()-1);
        s -= arr[index];
        subseqSum(index+1, ds, s, sum, arr, n);
    }


    public static void countOfSubsequence(int[] arr, int sum) {
        int count = subseqCount(0, 0, sum, arr, arr.length);
        System.out.printf("countOfSubsequence: sum=%d, count=%d%n", sum, count);
    }


    public static int subseqCount(int index, int s, int sum, int[] arr, int n) {
        if (index==n) {
            if (s==sum) {
                return 1;
            } else {
                return 0;
            }
        }

        s += arr[index];
        int l = subseqCount(index+1, s, sum, arr, n);

        s -= arr[index];
        int r = subseqCount(index+1, s, sum, arr, n);

        return l+r;
    }

    /**
     * Given an array of integers nums and a target integer target, write a
     * method called subarraySum that finds the indices of a contiguous subarray
     * in nums that add up to the target sum.
     *
     */
    public static int[] subarraySum(int[] nums, int target) {
        System.out.println(Arrays.toString(nums));
        Map<Integer, Integer> sumIndex = new HashMap<>();
        sumIndex.put(0, -1);
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            System.out.println("in loop: i="+i+", sumIndex="+sumIndex+", nums[i]="+nums[i]+
                    ", currentSum="+currentSum+", currentSum - target="+(currentSum - target));
            if (sumIndex.containsKey(currentSum - target)) {
                System.out.printf("Match found. i1=%d, i2=%d%n", sumIndex.get(currentSum - target) + 1, i);
                return new int[]{sumIndex.get(currentSum - target) + 1, i};
            }
            sumIndex.put(currentSum, i);
            System.out.println("loop end: i="+i+", sumIndex="+sumIndex);
        }

        return new int[]{};
    }

    public static void kth_Largest_MaxHeap(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);

        for (int a : arr) {
            pq.add(a);
        }
        System.out.printf("pq=%s%n", pq);

        for (int i=0; i<k-1; i++) {
            pq.remove();
        }
        System.out.printf("pq=%s%n", pq);

        System.out.printf("kth_Largest_MaxHeap: output -> %d%n", pq.peek());

    }

}
