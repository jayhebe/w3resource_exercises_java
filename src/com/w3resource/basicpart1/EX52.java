package com.w3resource.basicpart1;

/*
Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
Sample Output:

Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true
 */

import java.util.Scanner;

public class EX52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Input the second number: ");
        int secondNum = scanner.nextInt();
        System.out.print("Input the third number: ");
        int thirdNum = scanner.nextInt();

        System.out.println("The result is: " + (firstNum + secondNum == thirdNum));
    }
}
