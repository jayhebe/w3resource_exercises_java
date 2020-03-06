package com.w3resource.basicpart1;

/*
Write a Java program to accepts an integer and count the factors of the number.
Sample Output:

Input an integer: 25
3
 */

import java.util.Scanner;

public class EX57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
