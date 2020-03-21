package com.w3resource.basicpart1;

/*
Write a Java program to check if a given string has all unique characters.
Sample Output: Original String : xyyz
String has all unique characters: false
 */

public class EX141 {
    public static void main(String[] args) {
        String testStr = "xyz";
        System.out.println(hasUniqueChars(testStr));
    }

    private static boolean hasUniqueChars(String testStr) {
        boolean isUnique = false;

        char[] letter = testStr.toCharArray();
        char lastLetter = letter[0];
        for (int i = 1; i < letter.length; i++) {
            if (letter[i] == lastLetter) {
                isUnique = false;
                break;
            } else {
                isUnique = true;
                lastLetter = letter[i];
            }
        }

        return isUnique;
    }
}
