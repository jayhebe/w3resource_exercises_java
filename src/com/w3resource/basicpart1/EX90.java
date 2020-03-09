package com.w3resource.basicpart1;

/*
Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME.
 */

public class EX90 {
    public static void main(String[] args) {
        System.out.print("\nEnvironment variable PATH: ");
        System.out.println(System.getenv("PATH"));

        System.out.print("\nEnvironment variable TEMP: ");
        System.out.println(System.getenv("TEMP"));

        System.out.print("\nEnvironment variable USERNAME: ");
        System.out.println(System.getenv("USERNAME"));
    }
}
