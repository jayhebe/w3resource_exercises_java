package com.w3resource.basicpart1;

/*
Write a Java program to capitalize the first letter of each word in a sentence.
Sample Output:

Input a Sentence: the quick brown fox jumps over the lazy dog.
The Quick Brown Fox Jumps Over The Lazy Dog.
 */

import java.util.Scanner;

public class EX58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String sentence = scanner.nextLine();

        StringBuilder newSentence = new StringBuilder("");
        String[] words = sentence.split(" ");
        for (String word : words) {
            newSentence.append(Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ");
        }

        System.out.println(newSentence.toString().trim());
    }
}
