package com.w3resource.basicpart1;

/*
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/

import java.util.Scanner;

public class EX6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int i = scanner.nextInt();
        System.out.print("Input second number: ");
        int j = scanner.nextInt();

        System.out.println(i + " + " + j + " = " + (i + j));
        System.out.println(i + " - " + j + " = " + (i - j));
        System.out.println(i + " x " + j + " = " + (i * j));
        System.out.println(i + " / " + j + " = " + (i / j));
        System.out.println(i + " mod " + j + " = " + (i % j));
    }
}
