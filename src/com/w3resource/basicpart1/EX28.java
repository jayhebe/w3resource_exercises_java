package com.w3resource.basicpart1;

/*
Write a Java program to convert a hexadecimal to a decimal number.
Input Data:
Input a hexadecimal number: 25
Expected Output

Equivalent decimal number is: 37
 */

import java.util.Scanner;

import static com.w3resource.basicpart1.EX20.hexToInt;

public class EX28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a hexadecimal number: ");
        String hexNum = scanner.next();

        System.out.print("Equivalent decimal number is: " + hexToInt(hexNum));
    }
}
