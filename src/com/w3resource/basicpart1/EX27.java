package com.w3resource.basicpart1;

/*
Write a Java program to convert a octal number to a hexadecimal number.
Input Data:
Input a octal number : 100
Expected Output

Equivalent hexadecimal number: 40
 */

import java.util.Scanner;

import static com.w3resource.basicpart1.EX21.octToInt;
import static com.w3resource.basicpart1.EX20.intToHex;

public class EX27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a octal number: ");
        String octNum = scanner.next();

        System.out.print("Equivalent hexadecimal number: " + intToHex(octToInt(octNum)));
    }
}
