package com.w3resource.basicpart1;

/*
Write a Java program to check if a specified number
appears in every pair of adjacent element of a given array of integers.
 */

public class EX99 {
    public static void main(String[] args) {
        int[] array_nums = {10, 20, 10, 20, 40, 20, 50};
        int result = 0;
        int x = 20;
        for (int i = 0; i < array_nums.length - 1; i++) {
            if (array_nums[i] != x && array_nums[i + 1] != x) {
                result = 1;
            }
        }
        if (result == 0) {
            System.out.println(String.valueOf(true));
        } else {
            System.out.println(String.valueOf(false));
        }
    }
}
