package com.w3resource.basicpart1;

/*
Write a Java program to check whether an given integer is a power of 4 or not.
Given num = 64, return true. Given num = 6, return false.
 */

import java.util.Scanner;

public class EX110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        boolean flag = false;

        for (int i = 1; i < (int) Math.sqrt(num); i++) {
            if (Math.pow(4, i) == num) {
                flag = true;
                break;
            }
        }

        System.out.println(flag);
    }
}
