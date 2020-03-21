package com.w3resource.basicpart1;

/*
Write a Java program to remove the nth element from the end of a given list.
Sample Output:
Original node:
1 2 3 4 5
After removing 2nd element from end:
1 2 3 5
 */

import java.util.Arrays;

public class EX145 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length - 1];

        System.out.println("Original node: " + Arrays.toString(arr));
        int index = 3;
        int indexFromTheEnd = arr.length - index;

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != indexFromTheEnd) {
                newArr[j] = arr[i];
                j++;
            }
        }

        System.out.println("After removing No." + index + " element from end: " + Arrays.toString(newArr));
    }
}
