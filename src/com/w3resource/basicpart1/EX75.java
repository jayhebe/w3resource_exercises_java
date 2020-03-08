package com.w3resource.basicpart1;

/*
Write a Java program to test if the first and the last element of an array of integers are same.
The length of the array must be greater than or equal to 2.
Test Data: array = 50, -20, 0, 30, 40, 60, 10
Sample Output:

false
 */

public class EX75 {
    public static void main(String[] args) {
        int[] numbers = {50, -20, 0, 30, 40, 60, 10};
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
