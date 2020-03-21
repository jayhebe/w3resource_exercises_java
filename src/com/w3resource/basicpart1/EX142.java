package com.w3resource.basicpart1;

/*
Write a Java program to check if two given strings are anagrams or not.
According to Wikipedia "An anagram is a word or phrase formed by rearranging the letters
of a different word or phrase, typically using all the original letters exactly once.
For example, the word anagram can be rearranged into nag a ram, or the word binary into brainy."
Sample Output: String-1 : wxyz
String-2 : zyxw
Check if two given strings are anagrams or not?: true
 */

import java.util.Scanner;

public class EX142 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String-1: ");
        String str1 = scanner.nextLine();
        System.out.print("String-2: ");
        String str2 = scanner.nextLine();

        StringBuilder str2Builder = new StringBuilder(str2);
        System.out.println("Check if two given strings are anagrams or not?: " + str1.equals(str2Builder.reverse().toString()));
    }
}
