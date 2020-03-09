package com.w3resource.basicpart1;

/*
Write a Java program to check if a string starts with a specified word.
Sample Data: string1 = "Hello how are you?"
Sample Output:

true
 */

public class EX85 {
    public static void main(String[] args) {
        String startWord = "Hello";
        String data = "Hello how are you?";

        System.out.println(data.startsWith(startWord));
    }
}
