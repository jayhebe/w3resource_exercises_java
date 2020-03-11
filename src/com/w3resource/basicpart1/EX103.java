package com.w3resource.basicpart1;

/*
Write a Java program to create a new array from a given array of integers,
new array will contain the elements from the given array after the last element value 10.
 */

import java.util.Arrays;

public class EX103 {
    public static void main(String[] args) {
        int[] array_nums = {11, 11, 13, 10, 31, 45, 10, 20, 33, 53};
        int lastIndexOf10 = 0;
        for (int i = 0; i < array_nums.length; i++) {
            if (array_nums[i] == 10) {
                lastIndexOf10 = i;
            }
        }

        int[] new_array = new int[array_nums.length - lastIndexOf10 - 1];
        for (int i = 0, j = lastIndexOf10 + 1; j < array_nums.length; i++, j++) {
            new_array[i] = array_nums[j];
        }

        System.out.println(Arrays.toString(new_array));
    }
}
