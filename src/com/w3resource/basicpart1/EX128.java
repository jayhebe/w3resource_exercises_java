package com.w3resource.basicpart1;

/*
Write a Java program to calculate the median of an given unsorted array of integers.
Example: {10,2,38,23,38,23,21}
Output: 23
 */

import java.util.Arrays;

public class EX128 {
    public static void main(String[] args) {
        int[] arr = {10, 2, 38, 23, 38, 23, 21};
        System.out.println(getMedian(arr));
    }

    private static int getMedian(int[] arr) {
        int[] newArr = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < newArr.length; i++) {
            for (int j = i + 1; j < newArr.length; j++) {
                if (newArr[i] > newArr[j]) {
                    int temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }

        return newArr[newArr.length / 2];
    }
}
