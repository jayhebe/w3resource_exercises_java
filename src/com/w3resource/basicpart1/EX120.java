package com.w3resource.basicpart1;

/*
Write a Java program that searches a value in an m x n matrix.
 */

public class EX120 {
    public static void main(String[] args) {
        int value = 5;
        int[][] matrix = {{1, 2, 3}, {4, 5, 5}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == value) {
                    System.out.println(String.format("Found value %d at location (%d, %d)", value, i, j));
                }
            }
        }
    }
}
