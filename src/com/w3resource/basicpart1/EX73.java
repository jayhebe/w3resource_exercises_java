package com.w3resource.basicpart1;

/*
Write a Java program to create a new string taking first and last characters from two given strings.
If the length of either string is 0 use "#" for missing character.
Test Data: str1 = "Python"
str2 = " "
Sample Output:

P#
 */

import java.util.Scanner;

public class EX73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input str1: ");
        String str1 = scanner.next();
        System.out.print("Input str2: ");
        String str2 = scanner.next();

        str1 = str1.length() > 0 ? str1.substring(0, 1) : "#";
        str2 = str2.length() > 0 ? str2.substring(0, 1) : "#";

        System.out.println(str1 + str2);
    }
}
