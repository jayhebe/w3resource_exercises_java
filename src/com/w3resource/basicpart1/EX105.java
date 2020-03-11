package com.w3resource.basicpart1;

/*
Write a Java program to check if a group of numbers (l) at the start and end of a given array are same.
 */

import java.util.Arrays;

public class EX105 {
    public static void main(String[] args) {
        int[] array_nums = {11, 15, 13, 10, 45, 20, 11, 15};
        System.out.println("Original Array: " + Arrays.toString(array_nums));

        int result = 0;
        int l = 2;
        int start = 0;
        int end = array_nums.length - l;
        for (; l > 0; l--) {
            if (array_nums[start] != array_nums[end])
                result = 1;
            else {
                start++;
                end++;
            }
        }

        if (result == 1) {
            System.out.println(String.valueOf(false));
        } else {
            System.out.println(String.valueOf(true));
        }
        System.out.println("\n");
    }
}
