package com.w3resource.basicpart1;

/*
Write a Java program to get the first occurrence (Position starts from 0.) of an element of a given array.
 */

public class EX119 {
    public static void main(String[] args) {
        int ele = 5;
        int[] arr = {1, 3, 5, 7, 9};

        System.out.println(indexOf(ele, arr));
    }

    private static int indexOf(int ele, int[] arr) {
        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                result = i;
                break;
            }
        }

        return result;
    }
}
