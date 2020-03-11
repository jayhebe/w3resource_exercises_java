package com.w3resource.basicpart1;

/*
Write a Java program to form a staircase shape of n coins where every k-th row must have exactly k coins.
 */

import java.util.Scanner;

public class EX109 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int n = in.nextInt();
        if (n > 0) {
            System.out.println("Number of rows: " + ((int) ((Math.sqrt(8 * (long) n + 1) - 1) / 2)));
        }
    }
}
