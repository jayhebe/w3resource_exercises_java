package com.w3resource.basicpart1;

/*
Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39
25 < 39
25 <= 39
 */

import java.util.Scanner;

public class EX32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int firstNum = scanner.nextInt();
        System.out.print("Input second integer: ");
        int secondNum = scanner.nextInt();

        if (firstNum != secondNum) {
            System.out.println(firstNum + " != " + secondNum);
        } else {
            System.out.println(firstNum + " == " + secondNum);
        }

        if (firstNum < secondNum) {
            System.out.println(firstNum + " < " + secondNum);
            System.out.println(firstNum + " <= " + secondNum);
        } else {
            System.out.println(firstNum + " > " + secondNum);
            System.out.println(firstNum + " >= " + secondNum);
        }
    }
}
