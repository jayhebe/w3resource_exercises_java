package com.w3resource.basicpart1;

/*
Write a Java program to print the odd numbers from 1 to 99. Prints one number per line. Go to the editor
Sample Output:

1
3
5
7
9
11
....
91
93
95
97
99
 */

public class EX48 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
