package com.w3resource.basicpart1;

/*
Write a Java program to convert a octal number to a binary number.
Input Data:
Input any octal number: 7
Expected Output

Equivalent binary number: 111
 */

import java.util.Scanner;

import static com.w3resource.basicpart1.EX21.octToInt;
import static com.w3resource.basicpart1.EX17.intToBin;

public class EX26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        String octNum = scanner.next();

        System.out.print("Equivalent binary number: " + intToBin(octToInt(octNum)));
    }
}
