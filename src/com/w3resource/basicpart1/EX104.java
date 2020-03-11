package com.w3resource.basicpart1;

/*
Write a Java program to create a new array from a given array of integers,
new array will contain the elements from the given array before the last element value 10.
 */

import java.util.Arrays;

public class EX104 {
    public static void main(String[] args) {
        int[] array_nums = {11, 11, 13, 10, 31, 45, 10, 20, 33, 10, 53};
        int lastIndexOf10 = 0;
        for (int i = 0; i < array_nums.length; i++) {
            if (array_nums[i] == 10) {
                lastIndexOf10 = i;
            }
        }

        int[] new_array = new int[lastIndexOf10];
        for (int i = 0; i < lastIndexOf10; i++) {
            new_array[i] = array_nums[i];
        }

        System.out.println(Arrays.toString(new_array));
    }
}
