package com.w3resource.basicpart1;

/*
Write a Java program to check if a specified array of integers contains 10's or 30's
 */

public class EX102 {
    public static void main(String[] args) {
        int[] array_nums = {11, 11, 13, 31, 45, 20, 33, 53};
        boolean flag = false;

        for (int num : array_nums) {
            if (num == 10 || num == 30) {
                flag = true;
                break;
            }
        }

        System.out.println(flag);
    }
}
