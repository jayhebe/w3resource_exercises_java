package com.w3resource.basicpart1;

/*
Write a Java program to create a new string of 4 copies of the last 3 characters of the original string.
The length of the original string must be 3 and above.
Sample Output:

3.03.03.03.0
 */

import java.util.Scanner;

public class EX68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a sentence(at least 3 letters): ");
        String original = scanner.nextLine();

        System.out.println(original.substring(original.length() - 3).repeat(4));
    }
}
