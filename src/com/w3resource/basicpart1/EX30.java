package com.w3resource.basicpart1;

/*
Write a Java program to convert a hexadecimal to a octal number.
Input Data:
Input a hexadecimal number: 40
Expected Output

Equivalent of octal number is: 100
 */

import java.util.Scanner;

import static com.w3resource.basicpart1.EX20.hexToInt;
import static com.w3resource.basicpart1.EX21.intToOct;

public class EX30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a hexadecimal number: ");
        String hexNum = scanner.next();

        System.out.print("Equivalent of octal number is: " + intToOct(hexToInt(hexNum)));
    }
}
