package com.w3resource.basicpart1;

/*
Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT
 */

import java.util.Scanner;

public class EX37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String s = scanner.nextLine();

//        String reversedStr = "";
//        String[] strings = s.split("");
//        for (int i = strings.length - 1; i >= 0; i--) {
//            reversedStr += strings[i];
//        }

        StringBuilder reversedStr = new StringBuilder(s);
        System.out.println("Reverse string: " + reversedStr.reverse().toString());
    }
}
