package com.w3resource.basicpart1;

/*
Write a Java program to given a string and an offset, rotate string by offset (rotate from left to right).
 */

public class EX114 {
    public static void main(String[] args) {
        String test = "abcde";
        int offset = 3;

        System.out.println(rotateString(test, offset));
    }

    public static String rotateString(String str, int offset) {
        StringBuilder result = new StringBuilder();
        String str1 = str.substring(offset - 1);
        String str2 = str.substring(0, offset - 1);

        result.append(str1).append(str2);

        return result.toString();
    }
}
