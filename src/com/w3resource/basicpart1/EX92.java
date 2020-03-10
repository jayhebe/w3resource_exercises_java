package com.w3resource.basicpart1;

/*
Write a Java program to count the number of even and odd elements in a given array of integers.
 */

public class EX92 {
    public static void main(String[] args) {
        int numOfEven = 0;
        int numOfOdd = 0;

        int[] arr = {73, 12, 6, 17, 35, 89, 108, 66, 92};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                numOfEven++;
            } else if (arr[i] % 2 == 1) {
                numOfOdd++;
            }
        }

        System.out.println("Number of even: " + numOfEven);
        System.out.println("Number of odd: " + numOfOdd);
    }
}
