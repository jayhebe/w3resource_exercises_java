package com.w3resource.basicpart1;

/*
Write a Java program to insert a word in the middle of the another string.
Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
Sample Output:

Python Tutorial 3.0
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EX67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Input a word: ");
        String word = scanner.next();

        List<String> words = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        StringBuilder result = new StringBuilder();
        words.add(words.size() / 2, word);
        for (String w : words) {
            result.append(w).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
