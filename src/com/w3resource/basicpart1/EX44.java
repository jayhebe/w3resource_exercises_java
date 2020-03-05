package com.w3resource.basicpart1;

/*
Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
Sample Output:

Input number: 5
5 + 55  + 555
 */

import java.util.Scanner;

public class EX44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = scanner.nextInt();

        System.out.println(number + " + " + number * 11 + " + " + number * 111);
        System.out.println(String.format("%d + %d%d + %d%d%d", number, number, number, number, number, number));
    }
}
