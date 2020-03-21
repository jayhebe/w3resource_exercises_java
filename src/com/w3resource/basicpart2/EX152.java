package com.w3resource.basicpart2;

/*
Write a Java program that accepts four integer from the user and prints equal if all four are equal,
and not equal otherwise.

Sample Output:
Input first number: 25
Input second number: 37
Input third number: 45
Input fourth number: 23
Numbers are not equal!
 */

import java.util.Scanner;

public class EX152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int first = scanner.nextInt();
        System.out.print("Input second number: ");
        int second = scanner.nextInt();
        System.out.print("Input third number: ");
        int third = scanner.nextInt();
        System.out.print("Input fourth number: ");
        int fourth = scanner.nextInt();

        if (first == second && second == third && third == fourth) {
            System.out.println("Numbers are equal!");
        } else {
            System.out.println("Numbers are not equal!");
        }
    }
}
