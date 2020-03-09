package com.w3resource.basicpart1;

/*
Write a Java program start with an integer n,
divide n by 2 if n is even or multiply by 3 and add 1 if n is odd,
repeat the process until n = 1.
 */

import java.util.Scanner;

public class EX86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a integer n: ");
        int n = scanner.nextInt();

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else if (n % 2 == 1) {
                n = (n * 3) + 1;
            }

            System.out.println(n);
        }
    }
}
