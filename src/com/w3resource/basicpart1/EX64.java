package com.w3resource.basicpart1;

/*
Write a Java program that accepts two integer values between 25 to 75 and return true
if there is a common digit in both numbers.
Sample Output:

Input the first number : 35
Input the second number: 45
Result: true
 */

import java.util.Scanner;

public class EX64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number(25-75): ");
        int first = scanner.nextInt();
        System.out.println("Input the second number(25-75): ");
        int second = scanner.nextInt();

        System.out.println("Result: " + ((first / 10 == second / 10) ||
                (first / 10 == second % 10) ||
                (first % 10 == second / 10) ||
                (first % 10 == second % 10)));
    }
}
