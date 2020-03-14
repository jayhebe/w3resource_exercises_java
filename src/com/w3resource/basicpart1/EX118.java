package com.w3resource.basicpart1;

/*
Write a Java program to get the first occurrence (Position starts from 0.) of a string within a given string.
 */

public class EX118 {
    public static void main(String[] args) {
        String oriStr = "helloworld";
        String testStr = "owo";

        System.out.println(indexOf(oriStr, testStr));
    }

    private static int indexOf(String oriStr, String testStr) {
        int result = -1;
        boolean flag = true;

        char[] oriChars = oriStr.toCharArray();
        char[] testChars = testStr.toCharArray();

        for (int i = 0; i < oriChars.length && flag; i++) {
            if (oriChars[i] == testChars[0]) {
                for (int j = i + 1, k = 1; k < testChars.length; j++, k++) {
                    if (oriChars[j] != testChars[k]) {
                        result = -1;
                        break;
                    }
                    result = i;
                    flag = false;
                }
            }
        }

        return result;
    }
}
