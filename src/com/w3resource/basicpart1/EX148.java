package com.w3resource.basicpart1;

/*
Write a Java program to find the index of the first unique character in a given string,
assume that there is at least one unique character in the string.
Sample Output:
Original String: wresource
First unique character of the above: 0
 */

public class EX148 {
    public static void main(String[] args) {
        String testStr = "wwresource";
        char[] letters = testStr.toCharArray();

        int i;
        for (i = 0; i < letters.length; i++) {
            if (getCount(letters, letters[i]) == 1) {
                break;
            }
        }

        System.out.println("First unique character of the above: " + i);
    }

    private static int getCount(char[] chars, char value) {
        int count = 0;
        for (char ch : chars) {
            if (ch == value) {
                count++;
            }
        }

        return count;
    }
}
