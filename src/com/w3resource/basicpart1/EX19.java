package com.w3resource.basicpart1;

/*
Write a Java program to convert a decimal number to binary number.
Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101
*/

import java.util.Scanner;

import static com.w3resource.basicpart1.EX17.intToBin;

public class EX19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");
        int decimalNum = scanner.nextInt();

        System.out.println("Binary number is: " + intToBin(decimalNum));
    }
}
