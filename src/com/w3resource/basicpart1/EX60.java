package com.w3resource.basicpart1;

/*
Write a Java program to find the penultimate (next to last) word of a sentence.
Sample Output:

Input a String: The quick brown fox jumps over the lazy dog.
Penultimate word: lazy
 */

import java.util.Scanner;

public class EX60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        System.out.println("Penultimate word: " + words[words.length - 2]);
    }
}
