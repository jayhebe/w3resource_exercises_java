package com.w3resource.basicpart1;

/*
Write a Java program to rearrange all the elements of an given array of integers
so that all the odd numbers come before all the even numbers.
 */

import java.util.ArrayList;
import java.util.List;

public class EX94 {
    public static void main(String[] args) {
        int[] arr = {73, 12, 6, 17, 35, 89, 108, 66, 92};
        List<Integer> listEven = new ArrayList<>();
        List<Integer> listOdd = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                listEven.add(arr[i]);
            } else if (arr[i] % 2 == 1) {
                listOdd.add(arr[i]);
            }
        }
        listOdd.addAll(listEven);

        System.out.println(listOdd);
    }
}
