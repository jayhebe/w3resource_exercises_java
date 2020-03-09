package com.w3resource.basicpart1;

/*
Write a Java program to multiply corresponding elements of two arrays of integers.
Sample Output:

Array1: [1, 3, -5, 4]
Array2: [1, 4, -5, -2]
Result: 1 12 25 -8
 */

public class EX83 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, -5, 4};
        int[] arr2 = {1, 4, -5, -2};

        System.out.print("Result: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] * arr2[i] + " ");
        }
    }
}
