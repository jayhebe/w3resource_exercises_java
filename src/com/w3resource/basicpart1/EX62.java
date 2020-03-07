package com.w3resource.basicpart1;

/*
Write a Java program that accepts three integer values and return true
if one of them is 20 or more and less than the substractions of others.
Sample Output:

Input the first number : 15
Input the second number: 20
Input the third number : 25
false
 */

import java.util.Scanner;

public class EX62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        System.out.print("Input the third number : ");
        int z = in.nextInt();
        System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));
    }
}
