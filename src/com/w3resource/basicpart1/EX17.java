package com.w3resource.basicpart1;

/*
Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output

Sum of two binary numbers: 101
*/

import java.util.*;

public class EX17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        String first = scanner.next();
        System.out.print("Input second binary number: ");
        String second = scanner.next();

        System.out.println("Sum of two binary numbers: " + intToBin(binToInt(first) + binToInt(second)));
    }

    public static String intToBin(int intNumber) {
        StringBuffer result = new StringBuffer();

        while (true) {
            result.append(intNumber % 2);
            intNumber /= 2;
            if (intNumber == 0) {
                break;
            }
        }

        return result.reverse().toString();
    }

    public static int binToInt(String binNumber) {
        int result = 0;

        String[] bins = binNumber.split("");
        for (int i = 0; i < bins.length; i++) {
            result += (Integer.parseInt(bins[i]) * Math.pow(2, bins.length - i - 1));
        }

        return result;
    }
}
