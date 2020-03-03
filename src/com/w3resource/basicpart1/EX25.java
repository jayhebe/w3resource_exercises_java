package com.w3resource.basicpart1;

/*
Write a Java program to convert a octal number to a decimal number.
Input Data:
Input any octal number: 10
Expected Output

Equivalent decimal number: 8
 */

import java.util.Scanner;

import static com.w3resource.basicpart1.EX21.octToInt;
import static com.w3resource.basicpart1.EX20.intToHex;

public class EX25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        String octNum = scanner.next();

        System.out.print("Equivalent decimal number: " + intToHex(octToInt(octNum)));
    }
}
