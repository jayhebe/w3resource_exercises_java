package com.w3resource.basicpart1;

/*
Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
*/

import java.util.Scanner;

public class EX5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int i = scanner.nextInt();
        System.out.print("Input second number: ");
        int j = scanner.nextInt();

        System.out.println(i + " x " + j + " = " + i * j);
        scanner.close();
    }
}
