package com.w3resource.basicpart1;

/*
Write a Java program to create a new array of length 2 from two arrays of integers with three
elements and the new array will contain the first and last elements from the two arrays.
Test Data: array1 = 50, -20, 0
array2 = 5, -50, 10
Sample Output:

Array1: [50, -20, 0]
Array2: [5, -50, 10]
New Array: [50, 10]
 */

import java.util.Arrays;

public class EX77 {
    public static void main(String[] args) {
        int[] arr1 = {50, -20, 0};
        int[] arr2 = {5, -50, 10};

        System.out.println(Arrays.toString(new int[]{arr1[0], arr2[arr2.length - 1]}));
    }
}
