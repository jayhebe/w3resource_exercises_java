package com.w3resource.basicpart1;

/*
Write a Java program to find the new length of a given sorted array
where each element appear only once (remove the duplicates ).
Original array: [1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7] The length of the original array is: 11
After removing duplicates, the new length of the array is: 7
 */

public class EX131 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        System.out.println("The length of the original array is: " + arr.length);
        System.out.println("After removing duplicates, the new length of the array is: " + getUniqueLength(arr));
    }

    private static int getUniqueLength(int[] arr) {
        int len = 1;
        int lastValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != lastValue) {
                len++;
                lastValue = arr[i];
            }
        }

        return len;
    }
}
