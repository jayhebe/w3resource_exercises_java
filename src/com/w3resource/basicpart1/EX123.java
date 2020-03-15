package com.w3resource.basicpart1;

/*
Write a Java program to find the subarray with smallest sum from a given array of integers.
 */

public class EX123 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4};
        System.out.println(getMinSubArray(arr));
    }

    private static int getMinSubArray(int[] oriArray) {
        int[] nums1 = new int[oriArray.length];
        nums1[0] = oriArray[0];
        int min = nums1[0];
        for (int i = 1; i < oriArray.length; ++i) {
            nums1[i] = Math.min(oriArray[i], oriArray[i] + nums1[i - 1]);
            min = Math.min(min, nums1[i]);
        }
        return min;
    }
}
