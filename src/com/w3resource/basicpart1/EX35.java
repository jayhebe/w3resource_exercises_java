package com.w3resource.basicpart1;

/*
Write a Java program to compute the area of a polygon.
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output

The area is: 130.82084798405722
 */

import java.util.Scanner;

public class EX35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of sides on the polygon: ");
        int n = scanner.nextInt();
        System.out.print("Input the length of one of the sides: ");
        int s = scanner.nextInt();

        System.out.println("The area is: " + (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n)));
    }
}
