package com.w3resource.basicpart1;

/*
Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.
Sample Output:

Original Array: [5, 7]
true
 */

import java.util.Arrays;
import java.util.List;

public class EX78 {
    public static void main(String[] args) {
        Integer[] arr = {5, 7};
        List<Integer> list = Arrays.asList(arr);
        if (list.contains(4) || list.contains(7)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
