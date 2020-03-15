package com.w3resource.basicpart1;

/*
Write a Java program to find a number that appears only once in a given array of integers, all numbers occur twice.
Source Array : [10, 20, 10, 20, 30, 40, 40, 30, 50] 50 appears only once
 */

public class EX129 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 20, 30, 40, 40, 30, 50};
        for (int a : arr) {
            if (getCount(arr, a) == 1) {
                System.out.println(a);
            }
        }
    }

    private static int getCount(int[] arr, int value) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                count++;
            }
        }

        return count;
    }
}
