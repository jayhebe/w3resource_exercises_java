package com.w3resource.basicpart1;

/*
Write a Java program to create a new array that is left shifted from a given array of integers.
 */

import java.util.Arrays;

public class EX106 {
    public static void main(String[] args) {
        int[] array_nums = {11, 13, 10, 31, 45, 10, 20, 33, 53};
        int[] new_array = new int[array_nums.length];

        for (int i = 1, j = 0; i < array_nums.length; i++, j++) {
            new_array[j] = array_nums[i];
        }
        new_array[array_nums.length - 1] = array_nums[0];

        System.out.println(Arrays.toString(new_array));
    }
}
