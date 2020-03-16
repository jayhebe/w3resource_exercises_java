package com.w3resource.basicpart1;

/*
Write a Java program to find the new length of a given sorted array where duplicate elements appeared at most twice.
Original array: [1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7]
The length of the original array is: 13
After removing duplicates, the new length of the array is: 10
 */

public class EX132 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 7, 7, 7};
        System.out.println("The length of the original array is: " + arr.length);
        System.out.println("After removing duplicates, the new length of the array is: " + getMostTwiceLength(arr));
    }

    private static int getMostTwiceLength(int[] arr) {
        int len = 0;

        for (int i = 0; i < arr.length; ) {
            int count = getCount(arr, arr[i]);
            if (count <= 2) {
                len += count;
            } else {
                len += 2;
            }
            i += count;
        }

        return len;
    }

    private static int getCount(int[] arr, int value) {
        int count = 0;
        for (int item : arr) {
            if (item == value) {
                count++;
            }
        }

        return count;
    }
}
