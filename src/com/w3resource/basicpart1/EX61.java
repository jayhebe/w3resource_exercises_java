package com.w3resource.basicpart1;

/*
Write a Java program to reverse a word.
Sample Output:

Input a word: dsaf
Reverse word: fasd
 */

import java.util.Scanner;

public class EX61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word = scanner.next();
        StringBuilder reversedWord = new StringBuilder(word);

        System.out.println("Reverse word: " + reversedWord.reverse().toString());
    }
}
