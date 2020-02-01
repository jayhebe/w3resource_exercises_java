package com.w3resource.basicpart1;

/*
Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/

public class EX11
{
    public static void main(String[] args)
    {
        double radius = 7.5;

        System.out.println("Perimeter is = " + Math.PI * 2 * radius);
        System.out.println("Area is = " + Math.PI * radius * radius);
    }
}
