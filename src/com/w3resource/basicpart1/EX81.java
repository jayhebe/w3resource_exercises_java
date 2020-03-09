package com.w3resource.basicpart1;

/*
Write a Java program to swap the first and last elements of an array (length must be at least 1)
and create a new array.
Sample Output:

Original Array: [20, 30, 40]
New array after swaping the first and last elements: [40, 30, 20]
 */

import java.util.Arrays;

public class EX81 {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40};
        System.out.println("Original Array: "+ Arrays.toString(arr));
        int x = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = x;
        System.out.println("New array after swaping the first and last elements: "+Arrays.toString(arr));
    }
}
