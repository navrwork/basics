package com.navr.dsa.leet;

import java.util.*;

public class MyArrays {

    private int lastActiveIndex = 4; // m

    public static void main(String[] args) {
        MyArrays arrObj = new MyArrays();


        /*int[] nums1 = {2,4,6,8,0,0};
        int[] nums2 = {1,5};
        System.out.println("Before: nums1="+ java.util.Arrays.toString(nums1));
        arrObj.merge(nums1, arrObj.lastActiveIndex, nums2, nums2.length);
        System.out.println("After: nums1="+java.util.Arrays.toString(nums1));

        // Majority num
        MyArrays m = new MyArrays();
        int[] nums = {1,2,2,2,3,3,1};
//        int me = m.majorityElement(nums);
        int me = m.majorityElement_v2(nums);
        System.out.println("me="+me);*/

        // Rotate array
//        int[] numsx = {1,2,3,4,5,6,7};
//        int k = 3;
//        System.out.println("before rotate ... "+ Arrays.toString(numsx));
//        arrObj.rotate(numsx, 3);
//        System.out.println("After rotate ... "+ Arrays.toString(numsx));

//        int[] num = {1,3,7,10,12};
//        arrObj.findSumLinearTime(num, 4);

//        findMaxProfit();

        int[] numsx = {1,2,3,4,5,6,7};
        arrObj.rotate_v2(numsx, 3);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j=0; j<nums2.length;j++) {
            nums1[m+j] = nums2[j];
        }
        Arrays.sort(nums1);
    }

    private void insertInto(int[] nums1, int index, int numToBeInserted) {
        // Move existing elements to one position right
        for (int i=lastActiveIndex; i>=index; i-- ) {
            nums1[i+1] = nums1[i];
        }
        nums1[index] = numToBeInserted;
        lastActiveIndex += 1;

    }
    private void quickMerge(int[] nums1, int m, int[] nums2, int n) {
        for (int j=0; j<n;j++) {
            nums1[m+j] = nums2[j];
        }
        System.out.printf("quickMerge complete. %d elements added into nums1.%n", n);
    }

    public int majorityElement(int[] nums) {
        int halfCount = (int)(nums.length/2);
        Map<Integer, Integer> numCountMap = new HashMap<>();
        for (int num : nums) {
            numCountMap.put(num, numCountMap.getOrDefault(num, 0) + 1);
            if (numCountMap.getOrDefault(num, 0)>halfCount) {
                return num;
            }
        }
        System.out.println(numCountMap);
        Optional<Map.Entry<Integer, Integer>> firstElement = numCountMap.entrySet().stream().sorted(
                new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return o2.getValue()- o1.getValue();
                    }
                }
        ).findFirst();
        System.out.println("first="+firstElement);
        return firstElement.get().getKey();
    }

    public int majorityElement_v2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public void rotate(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        LinkedList<Integer> llist = new LinkedList<>();
        List<Integer> inList = new ArrayList<>();
        Arrays.stream(nums).forEach(llist::add);
        Arrays.stream(nums).forEach(dq::add);
        int counter = 1;
//        dq.
        for (Integer i : llist) {
            if (counter <= k) {
                Integer tmp1 = dq.removeLast();
                Integer tmp2 = dq.removeFirst();
                dq.addFirst(tmp1);
                dq.addLast(tmp2);
                /*Integer iTmp = dq.poll();
                dq.offer(iTmp);
                System.out.println("Rotating element "+iTmp);*/
                Integer i2 = llist.removeLast();

            }
        }
        System.out.println("dq="+dq);
    }

    public void rotate_v2(int[] nums, int k) {
        int[] nums2 = new int[nums.length];
        for (int i=0; i < nums.length; i++) {
            int j = (i+k)%nums.length;
            nums2[j] = nums[i];
        }
        System.out.println(Arrays.toString(nums2));
        nums = nums2;
    }

    private void findSumLinearTime(int[] a, int x) {
        int i=0, j=a.length-1;

        for ( ; i < a.length; ) {
            if (a[i]+a[j]==x) {
                System.out.printf("Found a match. n1=%d, n2=%d, i=%d, j=%d%n", a[i], a[j], i, j);
                break;
            } else if (a[i]+a[j]<x) {
                i++;
            } else {
                j--;
            }

            if (i>=j) break; // quit the loop
        }
    }

    private static void findMaxProfit() {
        int[] data = {1,2,3,4,5};
        boolean endOfList = false;
        int p1=0, p2=1;
        int maxP = 0;
        while(p2 < data.length) {
            int diff = data[p2]-data[p1];
            if (diff>maxP) {
                maxP = diff;
                System.out.printf("data[p2]=%d, data[p1]=%d, maxP=%d %n", data[p2], data[p1], diff);
            }
            if (diff>0) {
                p2++;
            } else {
                p1++;
                p2++;
            }
        }
        System.out.printf("maxP=%d %n", maxP);
    }

}
