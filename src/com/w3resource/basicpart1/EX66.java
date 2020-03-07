package com.w3resource.basicpart1;

/*
Write a Java program to compute the sum of the first 100 prime numbers.
Sample Output:

Sum of the first 100 prime numbers: 24133
 */

import java.util.ArrayList;
import java.util.List;

public class EX66 {
    public static void main(String[] args) {
        List<Integer> primeNumberList = getPrimeNumbers(100);
        int result = 0;
        for (int prime : primeNumberList) {
            result += prime;
        }

        System.out.println("Sum of the first 100 prime numbers: " + result);
    }

    public static List<Integer> getPrimeNumbers(int numberOfPrime) {
        List<Integer> primeNumberList = new ArrayList<>();
        for (int count = 0, i = 2; count < numberOfPrime; i++) {
            if (isPrime(i)) {
                count++;
                primeNumberList.add(i);
            }
        }

        return primeNumberList;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
