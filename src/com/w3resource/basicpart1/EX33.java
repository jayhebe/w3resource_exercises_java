package com.w3resource.basicpart1;

/*
Write a Java program and compute the sum of the digits of an integer.
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7
 */

import java.util.Scanner;

public class EX33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        String intNumber = scanner.next();
        int result = 0;
        String[] numbers = intNumber.split("");
        for (String number : numbers) {
            result += Integer.parseInt(number);
        }

        System.out.println("The sum of the digits is: " + result);
    }
}
