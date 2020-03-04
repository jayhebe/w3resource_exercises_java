package com.w3resource.basicpart1;

/*
Write a Java program to compute the distance between two points on the surface of earth.
Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
Input the latitude of coordinate 1: 25
Input the longitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5
Expected Output

The distance between those points is: 1480.0848451069087 km
 */

import java.util.Scanner;

public class EX36 {
    private static final double RADIUS_OF_EARTH = 6371.01;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate 1: ");
        double x1 = Math.toRadians(scanner.nextDouble());
        System.out.print("Input the longitude of coordinate 1: ");
        double y1 = Math.toRadians(scanner.nextDouble());
        System.out.print("Input the latitude of coordinate 2: ");
        double x2 = Math.toRadians(scanner.nextDouble());
        System.out.print("Input the longitude of coordinate 2: ");
        double y2 = Math.toRadians(scanner.nextDouble());

        System.out.println("The distance between those points is: " +
                RADIUS_OF_EARTH * Math.acos(Math.sin(x1) * Math.sin(x2) +
                        Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)) + " km");
    }
}
