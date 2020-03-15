package com.w3resource.basicpart1;

/*
Write a Java program to find a contiguous subarray with largest sum from a given array of integers.
Note: In computer science, the maximum subarray problem is the task of finding the contiguous subarray
within a one-dimensional array of numbers which has the largest sum.
For example, for the sequence of values −2, 1, −3, 4, −1, 2, 1, −5, 4; the contiguous subarray with
the largest sum is 4, −1, 2, 1, with sum 6. The subarray should contain one integer at least.
 */

public class EX122 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(getMaxSubArray(arr));
    }

    private static int getMaxSubArray(int[] oriArray) {
        if (oriArray.length < 1) {
            return 0;
        }
        int max = oriArray[0];
        int max_Begin = 0;
        int max_End = 0;
        int begin = 0;
        int end = 0;
        int sum = 0;
        while (end < oriArray.length) {
            sum += oriArray[end];
            if (sum < 0) {
                sum = 0;
                begin = end + 1;
            } else {
                if (sum > max) {
                    max = sum;
                    max_Begin = begin;
                    max_End = end;
                }
            }
            end++;
        }
        return max;
    }
}
