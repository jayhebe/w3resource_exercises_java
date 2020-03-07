package com.w3resource.basicpart1;

/*
Write a Java program that accepts two integer values from the user and return the larger values.
However if the two values are the same, return 0 and return the smaller value if
the two values have the same remainder when divided by 6.
Sample Output:

Input the first number : 12
Input the second number: 13
Result: 13
 */

import java.util.Scanner;

public class EX63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();
        System.out.print("Input the second number: ");
        int b = in.nextInt();
        System.out.println("Result: " + result(a, b));
    }

    public static int result(int x, int y) {
        if(x == y)
            return 0;

        if(x % 6 == y % 6)
            return (x < y) ? x : y;

        return (x > y) ? x : y;
    }
}
