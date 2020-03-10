package com.w3resource.basicpart1;

/*
Write a Java program to check if there is a 10 in a given array of integers with a 20 somewhere later in the array.
 */

public class EX96 {
    public static void main(String[] args) {
        boolean is10 = false;
        boolean is20 = false;
        int[] arr = {73, 12, 6, 20, 17, 10, 35, 89, 108, 66, 92};
        for (int num : arr) {
            if (num == 10) {
                is10 = true;
            }

            if (is10 && num == 20) {
                is20 = true;
            }
        }

        System.out.println(is10 && is20);
    }
}
