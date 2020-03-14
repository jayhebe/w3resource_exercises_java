package com.w3resource.basicpart1;

/*
Write a Java program to add two numbers without using any arithmetic operators.
Given x = 10 and y = 12; result = 22
 */

import java.util.Scanner;

public class EX111 {
    public static void main(String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        x = in.nextInt();
        System.out.print("Input second number: ");
        y = in.nextInt();
        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        System.out.print("Sum: " + x);
        System.out.print("\n");
    }
}
