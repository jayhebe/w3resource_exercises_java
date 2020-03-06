package com.w3resource.basicpart1;

/*
Write a Java program that accepts three integers from the user and return true
if two or more of them (integers) have the same rightmost digit.
The integers are non-negative.
Sample Output:

Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true
 */

import java.util.Scanner;

public class EX54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Input the second number: ");
        int secondNum = scanner.nextInt();
        System.out.print("Input the third number: ");
        int thirdNum = scanner.nextInt();

        System.out.println("The result is: " + (firstNum % 10 == secondNum % 10 ||
                firstNum % 10 == thirdNum % 10 || secondNum % 10 == thirdNum % 10));
    }
}
