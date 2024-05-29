package com.navr.dsa.leet.array;

import java.util.Arrays;

/**
 * Problem description: <br/>
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * <br/><br/>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <br/><br/>
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements
 * that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * <br/><br/>
 * Sample input/output:
 * <pre>
 * i.
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 *
 * ii.
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 *
 * iii.
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * </pre>
 * <br/><br/>
 * Reference:
 * <a
 * href="https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150">
 * merge-sorted-array | leetcode.com</a>
 */
public class MergeSortedArrays {
    public static void main(String[] args) {
//        // #1:
//        int[] nums1a = new int[]{1, 2, 3, 0, 0, 0};
//        int[] nums2a = new int[]{2, 5, 6};
//        mergeUsingTwoPointer(nums1a, 3, nums2a, nums2a.length);
//        printArray(nums1a);
//
//        // #2:
//        int[] nums1b = new int[]{1, 2, 3, 4, 0, 0};
//        int[] nums2b = new int[]{5, 6};
//        mergeUsingTwoPointer(nums1b, 4, nums2b, nums2b.length);
//        printArray(nums1b);
//
//        // #3:
//        int[] nums1c = new int[]{1, 2, 3, 4, 5, 6};
//        int[] nums2c = new int[]{};
//        mergeUsingTwoPointer(nums1c, 6, nums2c, nums2c.length);
//        printArray(nums1c);
//
//        // #4:
//        int[] nums1d = new int[]{0, 0, 0};
//        int[] nums2d = new int[]{2, 4, 6};
//        mergeUsingTwoPointer(nums1d, 0, nums2d, nums2d.length);
//        printArray(nums1d);
//
//        // #5:
//        int[] nums1e = new int[]{2, 0};
//        int[] nums2e = new int[]{1};
//        mergeUsingTwoPointer(nums1e, 1, nums2e, nums2e.length);
//        printArray(nums1e);
//
//        // #6:
//        int[] nums1f = new int[]{4, 5, 6, 0, 0, 0};
//        int[] nums2f = new int[]{1, 2, 3};
//        mergeUsingTwoPointer(nums1f, 3, nums2f, nums2f.length);
//        printArray(nums1f);

//        // #7:
//        int[] nums1g = new int[]{4,0,0,0,0,0};
//        int[] nums2g = new int[]{1,2,3,5,6};
//        mergeUsingTwoPointer(nums1g, 1, nums2g, nums2g.length);
//        printArray(nums1g);

        // #8:
        int[] nums1h = new int[]{1, 2, 4, 5, 6, 0};
        int[] nums2h = new int[]{3};
        mergeUsingTwoPointer(nums1h, 5, nums2h, nums2h.length);
        printArray(nums1h);
    }

    public static void mergeUsingTwoPointer(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, k = m + n - 1;
//        printArray(nums1, nums2);
        System.out.printf("p1=%d, p2=%d, k=%d%n", p1, p2, k);

        if (m == 0) { // to handle usecase #4
            System.arraycopy(nums2, 0, nums1, 0, n);
        } else if (n > 0) {
            while (n > 0) {
                System.out.printf("p1=%d, p2=%d, k=%d%n", p1, p2, k);
                printArray(nums1, nums2);
                if (nums1[p1] > nums2[p2]) {
                    nums1[k] = nums1[p1];
                    nums1[p1] = nums2[p2];
                    int val = nums2[p2];

                    // swap neighbour elements until the
                    // new element is placed in correct position
                    while (p1 > 0 && val <= nums1[p1 - 1]) {
                        System.out.printf("Continue Swap loop --> until val=%d < nums1[p1-1]=%d%n",
                                val, nums1[p1 - 1]);
                        printArray(nums1);

                        swap(nums1, p1, p1 - 1);
                        p1--;
                        printArray(nums1, nums2);
                    }
                    p2--;
                    k--;
                } else if (nums1[p1] < nums2[p2]) {
                    nums1[k] = nums2[p2];
                    p2--;
                    k--;
                }
                n--;
            }
        }
    }

    private static void swap(int[] n, int pos1, int pos2) {
        int tmp = n[pos1];
        n[pos1] = n[pos2];
        n[pos2] = tmp;
    }

    public static void printArray(int[] nums) {
        System.out.printf("nums => %s%n%n", Arrays.toString(nums));
    }

    public static void printArray(int[] nums1, int[] nums2) {
        System.out.printf("nums1[] => %s, nums2[] => %s%n", Arrays.toString(nums1), Arrays.toString(nums2));
    }
}
