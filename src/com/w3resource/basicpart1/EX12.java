package com.w3resource.basicpart1;

/*
Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
*/

public class EX12
{
    public static void main(String[] args)
    {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        System.out.println("The average of the 3 numbers is " + (a + b + c) / 3);
    }
}
