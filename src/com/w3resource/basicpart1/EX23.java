package com.w3resource.basicpart1;

/*
Write a Java program to convert a binary number to hexadecimal number.
Input Data:
Input a Binary Number: 1101
Expected Output

HexaDecimal value: D
 */

import java.util.Scanner;

import static com.w3resource.basicpart1.EX17.binToInt;
import static com.w3resource.basicpart1.EX20.intToHex;

public class EX23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Binary Number: ");
        String binNum = scanner.next();

        System.out.print("HexaDecimal value: " + intToHex(binToInt(binNum)));
    }
}
