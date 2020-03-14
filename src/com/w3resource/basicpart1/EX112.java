package com.w3resource.basicpart1;

/*
Write a Java program to compute the number of trailing zeros in a factorial.
7! = 5040, therefore the output should be 1
 */

public class EX112 {
    public static void main(String[] args) {
        char[] result = String.valueOf(getFactorial(10)).toCharArray();
        int count = 0;
        for (int i = result.length - 1; i >= 0; i--) {
            if (result[i] == '0') {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }

    public static int getFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
