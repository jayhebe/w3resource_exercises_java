package com.w3resource.basicpart1;

/*
Write a Java program to extract the first half of a string of even length.
Test Data: Python
Sample Output:
Pyt
 */

public class EX69 {
    public static void main(String[] args) {
        String data = "Python";
        System.out.println(data.substring(0, data.length() / 2));
    }
}
