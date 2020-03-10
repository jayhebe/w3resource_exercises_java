package com.w3resource.basicpart1;

/*
Write a Java program to measure how long some code takes to execute in nanoseconds.
 */

public class EX91 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        someCode();
        long endTime = System.nanoTime();

        System.out.println(endTime - startTime);
    }

    public static void someCode() {
        int result = 0;
        for (int i = 0; i < 1000000; i++) {
            result += i;
        }
    }
}
