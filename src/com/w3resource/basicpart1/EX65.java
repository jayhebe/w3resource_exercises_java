package com.w3resource.basicpart1;

/*
Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
Sample Output:

Input the first number : 19
Input the second number: 7
5
 */

import java.util.Scanner;

public class EX65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int first = scanner.nextInt();
        System.out.print("Input the second number: ");
        int second = scanner.nextInt();

        System.out.println(first - first / second * second);
    }
}
