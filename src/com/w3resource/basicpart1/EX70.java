package com.w3resource.basicpart1;

/*
Write a Java program to create a string in the form short_string + long_string + short_string from two strings.
The strings must not have the same length.
Test Data: Str1 = Python
Str2 = Tutorial
Sample Output:

PythonTutorialPython
 */

import java.util.Scanner;

public class EX70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string 1: ");
        String data1 = scanner.next();
        System.out.print("Input string 2(must have different length with string 1): ");
        String data2 = scanner.next();

        String longer = data1.length() > data2.length() ? data1 : data2;
        String shorter = data1.length() < data2.length() ? data1 : data2;

        System.out.println(shorter + longer + shorter);
    }
}
