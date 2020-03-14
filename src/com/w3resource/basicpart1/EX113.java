package com.w3resource.basicpart1;

/*
Write a Java program to merge two given sorted array of integers and create a new sorted array.
array1 = [1,2,3,4]
array2 = [2,5,7, 8]
result = [1,2,2,3,4,5,7,8]
 */

import java.util.Arrays;

public class EX113 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 6};
        int[] array2 = {2, 5, 7, 8, 11};

        int[] new_array = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            new_array[i] = array1[i];
        }

        for (int i = 0, j = array2.length; j < new_array.length; i++, j++) {
            new_array[j] = array2[i];
        }

        for (int i = 0; i < new_array.length - 1; i++) {
            for (int j = i + 1; j < new_array.length; j++) {
                if (new_array[i] > new_array[j]) {
                    int temp = new_array[i];
                    new_array[i] = new_array[j];
                    new_array[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(new_array));
    }
}
