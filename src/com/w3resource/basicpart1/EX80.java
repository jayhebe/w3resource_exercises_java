package com.w3resource.basicpart1;

/*
Write a Java program to get the larger value between first and last element of an array (length 3) of integers.
Sample Output:

Original Array: [20, 30, 40]
Larger value between first and last element: 40
 */

public class EX80 {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40};
        System.out.println(arr[0] > arr[arr.length - 1] ? arr[0] : arr[arr.length - 1]);
    }
}
