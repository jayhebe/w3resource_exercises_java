package com.w3resource.basicpart1;

/*
Write a Java program to check if an array of integers contains three increasing adjacent numbers.
 */

public class EX107 {
    public static void main(String[] args) {
        int[] array_nums = {11, 13, 10, 31, 45, 10, 11, 12, 20, 33, 53};
        boolean haveAdjacentNumbers = false;
        for (int i = 0; i < array_nums.length - 2; i++) {
            if ((array_nums[i + 2] - array_nums[i + 1] == 1) && (array_nums[i + 1] - array_nums[i] == 1)) {
                haveAdjacentNumbers = true;
                break;
            }
        }

        System.out.println(haveAdjacentNumbers);
    }
}
