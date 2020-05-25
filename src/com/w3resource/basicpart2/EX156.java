package com.w3resource.basicpart2;

/*
Write a Java program that returns the largest integer but not larger than the base-2 logarithm of a specified integer.

Original Number: 2350
Result: 11
*/

import java.util.Scanner;

public class EX156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Original Number: ");
        int original = scanner.nextInt();

        int result = 0;
        while (Math.pow(2, result + 1) < original) {
            result++;
        }

        System.out.println("Result: " + result);
    }
}
