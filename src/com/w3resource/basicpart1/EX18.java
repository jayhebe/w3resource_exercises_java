package com.w3resource.basicpart1;

/*
Write a Java program to multiply two binary numbers.
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output

Product of two binary numbers: 110
*/

import java.util.Scanner;

import static com.w3resource.basicpart1.EX17.binToInt;
import static com.w3resource.basicpart1.EX17.intToBin;

public class EX18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        String first = scanner.next();
        System.out.print("Input second binary number: ");
        String second = scanner.next();

        System.out.println("Product of two binary numbers: " +
                intToBin(binToInt(first) * binToInt(second)));
    }
}
