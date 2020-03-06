package com.w3resource.basicpart1;

/*
Write a Java program that accepts three integers from the user and return true
if the second number is greater than first number and third number is greater than second number.
If "abc" is true second number does not need to be greater than first number.
Sample Output:

Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true
 */

import java.util.Scanner;

public class EX53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Input the second number: ");
        int secondNum = scanner.nextInt();
        System.out.print("Input the third number: ");
        int thirdNum = scanner.nextInt();

        System.out.println("The result is: " + testNum(firstNum, secondNum, thirdNum, true));
    }

    public static boolean testNum(int x, int y, int z, boolean abc) {
        if (abc) {
            return z > y;
        }
        return x < y && y < z;
    }
}
