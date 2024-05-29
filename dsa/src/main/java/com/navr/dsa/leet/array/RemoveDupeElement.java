package com.navr.dsa.leet.array;

import java.util.Arrays;

/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
 * The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 *
 */
public class RemoveDupeElement {
    public static void main(String[] args) {
        //#1:
//        int[] nums1 = {3,2,2,3};
//        removeElement(nums1, 3);

        //#2:
//        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
//        removeElement(nums2, 2);

        //#3:
        int[] nums3 = {4, 5};
        removeElement(nums3, 4);

    }

    public static int removeElement(int[] nums, int val) {
        int i = nums.length - 1;
        int dupCount = 0;

        while (i > 0) {
            System.out.printf("nums=%s%n", Arrays.toString(nums));
            if (nums[i - 1] == val) {
                int numOfNonDupElementsYet = nums.length - i - dupCount - 1;
                //
                System.out.printf("before_copy: System.arraycopy(%s, %d, %d, %d)%n",
                        Arrays.toString(nums), i, i - 1, numOfNonDupElementsYet);
                System.arraycopy(nums, i, nums, i - 1, numOfNonDupElementsYet);
                dupCount++; // Increment numOfDupElements count
                nums[nums.length - dupCount - 1] = val;
                System.out.printf("after_copy: %s%n", Arrays.toString(nums));
            }
            i--;
        }
        if (nums.length > 0 && nums[nums.length - 1] == val) { // handle counter for last element
            dupCount++;
        }
        int k  = nums.length - dupCount;
        System.out.printf("%nk=%d%n", k);
        return k;
    }

    private static void swap(int[] n, int pos1, int pos2) {
        System.out.printf("swap(pos1=%d, pos2=%d)%n", pos1, pos2);
        int tmp = n[pos1];
        n[pos1] = n[pos2];
        n[pos2] = tmp;
    }
}
