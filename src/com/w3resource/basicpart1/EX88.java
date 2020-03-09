package com.w3resource.basicpart1;

/*
Write a Java program to get the current system environment and system properties.
 */

public class EX88 {
    public static void main(String[] args) {
        System.out.println("\nCurrent system environment:");
        System.out.println(System.getenv());
        System.out.println("\n\nCurrent system properties:");
        System.out.println(System.getProperties());
    }
}
