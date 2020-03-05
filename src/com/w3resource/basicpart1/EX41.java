package com.w3resource.basicpart1;

/*
Write a Java program to print the ascii value of a given character.
Expected Output

The ASCII value of Z is :90
 */

import java.util.Scanner;

public class EX41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letterStr = scanner.next();
        char letterChar = letterStr.charAt(0);

        System.out.println("The ASCII value of " + letterChar + " is: " + (int) letterChar);
    }
}
