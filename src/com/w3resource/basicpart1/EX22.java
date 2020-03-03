package com.w3resource.basicpart1;

/*
Write a Java program to convert a binary number to decimal number.
Input Data:
Input a binary number: 100
Expected Output

Decimal Number: 4
 */

import java.util.Scanner;

import static com.w3resource.basicpart1.EX17.binToInt;

public class EX22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binNum = scanner.next();

        System.out.print("Decimal Number: " + binToInt(binNum));
    }
}
