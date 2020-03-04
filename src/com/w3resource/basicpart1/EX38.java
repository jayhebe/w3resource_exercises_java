package com.w3resource.basicpart1;

/*
Write a Java program to count the letters, spaces, numbers and other characters of an input string.
Expected Output

The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23
space: 9
number: 10
other: 6
 */

import java.util.Scanner;

public class EX38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String inputStr = scanner.nextLine();
        String[] strs = inputStr.split("");

        int numOfLetter = 0;
        int numOfSpace = 0;
        int numOfNumber = 0;
        int numOfOther = 0;

        for (String str : strs) {
            if (str.matches("[A-Za-z]")) {
                numOfLetter += 1;
                continue;
            }

            if (str.matches("\\s")) {
                numOfSpace += 1;
                continue;
            }

            if (str.matches("\\d")) {
                numOfNumber += 1;
                continue;
            }

            numOfOther += 1;
        }

        System.out.println("letter: " + numOfLetter);
        System.out.println("space: " + numOfSpace);
        System.out.println("number: " + numOfNumber);
        System.out.println("other: " + numOfOther);
    }
}
