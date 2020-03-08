package com.w3resource.basicpart1;

/*
Write a Java program to test if 10 appears as either the first or last element of an array of integers.
The length of the array must be greater than or equal to 2.
Sample Output:
Test Data: array = 10, -20, 0, 30, 40, 60, 10

true
 */

import java.util.Arrays;
import java.util.List;

public class EX74 {
    public static void main(String[] args) {
        Integer[] numbers = {10, -20, 0, 30, 40, 60, 10};
        List<Integer> numberList = Arrays.asList(numbers);
        if (numberList.get(0) == 10 || numberList.get(numberList.size() - 1) == 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
