package com.w3resource.basicpart1;

/*
Write a Java program to check if the number of 10 is greater than number to 20's in a given array of integers.
 */

public class EX101 {
    public static void main(String[] args) {
        int[] array_nums = {10, 11, 10, 30, 45, 20, 33, 53};
        int numOf10 = 0;
        int numOf20 = 0;

        for (int array_num : array_nums) {
            if (array_num == 10) {
                numOf10++;
            }

            if (array_num == 20) {
                numOf20++;
            }
        }

        System.out.println(numOf10 > numOf20);
    }
}
