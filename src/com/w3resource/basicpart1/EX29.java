package com.w3resource.basicpart1;

/*
Write a Java program to convert a hexadecimal to a binary number.
Input Data:
Enter Hexadecimal Number : 37
Expected Output

Equivalent Binary Number is: 110111
 */

import java.util.Scanner;

import static com.w3resource.basicpart1.EX17.intToBin;
import static com.w3resource.basicpart1.EX20.hexToInt;

public class EX29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Hexadecimal Number: ");
        String hexNum = scanner.next();

        System.out.print("Equivalent Binary Number is: " + intToBin(hexToInt(hexNum)));
    }
}
