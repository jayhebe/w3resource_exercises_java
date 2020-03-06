package com.w3resource.basicpart1;

/*
Write a Java program to convert a string to an integer in Java.
Sample Output:

Input a number(string): 25
The integer value is: 25
 */

import java.util.Scanner;

public class EX51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String number = scanner.next();

        System.out.println("The integer value is: " + Integer.parseInt(number));
    }
}
