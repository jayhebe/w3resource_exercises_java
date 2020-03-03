package com.w3resource.basicpart1;

/*
Write a Java program to convert a binary number to a Octal number.
Input Data:
Input a Binary Number: 111
Expected Output

Octal number: 7
 */

import java.util.Scanner;

import static com.w3resource.basicpart1.EX17.binToInt;
import static com.w3resource.basicpart1.EX21.intToOct;

public class EX24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Binary Number: ");
        String binNum = scanner.next();

        System.out.print("Octal number: " + intToOct(binToInt(binNum)));
    }
}
