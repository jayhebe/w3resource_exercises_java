package com.w3resource.basicpart2;

/*
Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.

Sample Output:
Input first number: 5
Input second number: 1
false
 */

import java.util.Scanner;

public class EX153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        double first = scanner.nextDouble();
        System.out.print("Input second number: ");
        double second = scanner.nextDouble();

        if (first >= 0 && first <= 1 && second >= 0 && second <= 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
