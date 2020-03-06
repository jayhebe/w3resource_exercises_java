package com.w3resource.basicpart1;

/*
Write a Java program to find the number of integers within the range of two specified numbers and
that are divisible by another number.
For example x = 5, y=20 and p =3, find the number of integers within the range x..y and
that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
Sample Output:

5
 */

public class EX56 {
    public static void main(String[] args) {
        int x = 5;
        int y = 20;
        int p = 3;

        for (int i = x; i <= y; i++) {
            if (i % p == 0) {
                System.out.println(i);
            }
        }
    }
}
