package com.w3resource.basicpart1;

/*
Write a Java program to swap two variables.
*/

public class EX15
{
    public static void main(String[] args)
    {
        int a = 3;
        int b = 4;
        System.out.println("Before swap: a = " + a + ", b = " + b);

        int temp;
        temp = b;
        b = a;
        a = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
