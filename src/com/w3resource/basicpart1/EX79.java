package com.w3resource.basicpart1;

/*
Write a Java program to rotate an array (length 3) of integers in left direction.
Sample Output:

Original Array: [20, 30, 40]
Rotated Array: [30, 40, 20]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EX79 {
    public static void main(String[] args) {
        Integer[] original = {20, 30, 40};
        List<Integer> list = new ArrayList<>(Arrays.asList(original));
        list.add(list.remove(0));

        System.out.println(list.toString());
    }
}
