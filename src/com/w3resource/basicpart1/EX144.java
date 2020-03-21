package com.w3resource.basicpart1;

/*
Write a Java program to remove all occurrences of a specified value in a given array of integers and
return the new length of the array.
Sample Output:
Original array: [1, 4, 6, 7, 6, 2]
The length of the new array is: 4
 */

import java.util.Arrays;

public class EX144 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 7, 6, 2};
        int value = 6;
        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("The length of the new array is: " + removeOccurrences(nums, value));
    }

    private static int removeOccurrences(int[] arr, int value) {
        int len = 0;

        for (int item : arr) {
            if (item != value) {
                len++;
            }
        }

        return len;
    }
}
