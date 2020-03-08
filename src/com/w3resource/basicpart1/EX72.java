package com.w3resource.basicpart1;

/*
Write a Java program to create a new string taking first three characters from a given string.
If the length of the given string is less than 3 use "#" as substitute characters.
Test Data: Str1 = " "
Sample Output:

###
 */

public class EX72 {
    public static void main(String[] args) {
        String str1 = "Python";

        if (str1.length() < 3) {
            System.out.println("###");
        } else {
            System.out.println(str1.substring(0, 3));
        }
    }
}
