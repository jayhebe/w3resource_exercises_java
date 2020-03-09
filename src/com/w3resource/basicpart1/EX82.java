package com.w3resource.basicpart1;

/*
Write a Java program to find the largest element between first, last,
and middle values from an array of integers (even length).
Sample Output:

Original Array: [20, 30, 40, 50, 67]
Largest element between first, last, and middle values: 67
 */

public class EX82 {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 50, 67};
        int first = arr[0];
        int middle = arr[arr.length / 2];
        int last = arr[arr.length - 1];

        int bigger = Math.max(first, middle);
        System.out.println("Largest element between first, last, and middle values: " + (Math.max(bigger, last)));
    }
}
