package com.w3resource.basicpart1;

/*
Write a Java program than read an integer and calculate
the sum of its digits and write the number of each digit of the sum in English.
 */

import java.util.Scanner;

public class EX87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input an integer: ");
        String number = scanner.next();
        String[] digits = number.split("");

        int sum = 0;
        for (String digit : digits) {
            sum += (Integer.parseInt(digit));
        }

        String[] numberList = {
                "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        };
        StringBuilder numberName = new StringBuilder();
        String numStr = sum + "";
        String[] nums = numStr.split("");
        for (String num : nums) {
            numberName.append(numberList[Integer.parseInt(num)]).append(" ");
        }

        System.out.println("Sum of the digits: " + sum);
        System.out.println("English name: " + numberName.toString());
    }
}
