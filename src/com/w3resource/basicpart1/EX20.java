package com.w3resource.basicpart1;

/*
Write a Java program to convert a decimal number to hexadecimal number.
Input Data:
Input a decimal number: 15
Expected Output

Hexadecimal number is : F
 */

import java.util.*;

public class EX20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int decimalNum = scanner.nextInt();

        System.out.print("Hexadecimal number is: " + intToHex(decimalNum));
    }

    public static String intToHex(int intNumber) {
        StringBuilder result = new StringBuilder();

        char[] hexChars = new char[]{
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
        };

        while (true) {
            result.append(hexChars[intNumber % 16]);
            intNumber /= 16;
            if (intNumber == 0) {
                break;
            }
        }

        return result.reverse().toString();
    }

    public static int hexToInt(String hexNumber) {
        int result = 0;

        Map<String, Integer> hexMap = new HashMap<>();
        hexMap.put("0", 0);
        hexMap.put("1", 1);
        hexMap.put("2", 2);
        hexMap.put("3", 3);
        hexMap.put("4", 4);
        hexMap.put("5", 5);
        hexMap.put("6", 6);
        hexMap.put("7", 7);
        hexMap.put("8", 8);
        hexMap.put("9", 9);
        hexMap.put("A", 10);
        hexMap.put("B", 11);
        hexMap.put("C", 12);
        hexMap.put("D", 13);
        hexMap.put("E", 14);
        hexMap.put("F", 15);

        String[] hexes = hexNumber.split("");
        for (int i = 0; i < hexes.length; i++) {
            result += (hexMap.get(hexes[i]) * Math.pow(16, hexes.length - i - 1));
        }

        return result;
    }
}
