package com.w3resource.basicpart1;

/*
Write a Java program to find the index of a value in a sorted array.
If the value does not find return the index where it would be if it were inserted in order.
Example:
[1, 2, 4, 5, 6] 5(target) -> 3(index)
[1, 2, 4, 5, 6] 0(target) -> 0(index)
[1, 2, 4, 5, 6] 7(target) -> 5(index)
 */

public class EX124 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int t1 = 5;
        int t2 = 0;
        int t3 = 7;

        System.out.println(getIndex(arr, t1));
        System.out.println(getIndex(arr, t2));
        System.out.println(getIndex(arr, t3));
    }

    private static int getIndex(int[] sortedArray, int value) {
        int index = -1;

        for (int i = 0; i < sortedArray.length; i++) {
            if (sortedArray[i] == value) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            for (int i = 0; i < sortedArray.length; i++) {
                if (sortedArray[i] > value) {
                    index = i;
                    break;
                }
                index = sortedArray.length;
            }
        }

        return index;
    }
}
