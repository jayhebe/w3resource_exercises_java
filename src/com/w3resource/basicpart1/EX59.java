package com.w3resource.basicpart1;

/*
Write a Java program to convert a given string into lowercase.
Sample Output:

Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
the quick brown fox jumps over the lazy dog.
 */

import java.util.Scanner;

public class EX59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String sentence = scanner.nextLine();

        System.out.println(sentence.toLowerCase());
    }
}
