package com.w3resource.basicpart1;

/*
Write a Java program to convert a decimal number to octal number.
Input Data:
Input a Decimal Number: 15
Expected Output

Octal number is: 17
 */

import java.util.Scanner;

public class EX21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");
        int decimalNum = scanner.nextInt();

        System.out.print("Octal number is: " + intToOct(decimalNum));
    }

    public static String intToOct(int intNumber) {
        StringBuilder result = new StringBuilder();

        while (true) {
            result.append(intNumber % 8);
            intNumber /= 8;
            if (intNumber == 0) {
                break;
            }
        }

        return result.reverse().toString();
    }

    public static int octToInt(String octNumber) {
        int result = 0;

        String[] bins = octNumber.split("");
        for (int i = 0; i < bins.length; i++) {
            result += (Integer.parseInt(bins[i]) * Math.pow(8, bins.length - i - 1));
        }

        return result;
    }
}
