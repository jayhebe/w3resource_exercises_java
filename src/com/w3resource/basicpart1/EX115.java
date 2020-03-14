package com.w3resource.basicpart1;

/*
Write a Java program to check if a positive number is a palindrome or not.
Input a positive integer: 151
Is 151 is a palindrome number?
true
 */

import java.util.Scanner;

public class EX115 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int number = scanner.nextInt();

        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(int number) {
        boolean result = false;

        int reversedNumber = Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());
        if (number == reversedNumber) {
            result = true;
        }

        return result;
    }
}
