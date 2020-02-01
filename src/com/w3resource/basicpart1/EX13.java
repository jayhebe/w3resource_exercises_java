package com.w3resource.basicpart1;

/*
Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.6 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
*/

public class EX13
{
    public static void main(String[] args)
    {
        double width = 5.6;
        double height = 8.5;

        System.out.println("Area is " + width + " * " + height + " = " + (width * height));
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + 2 * (width + height));
    }
}
