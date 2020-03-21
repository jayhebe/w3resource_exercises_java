package com.w3resource.basicpart2;

/*
Write a Java program to print an array after changing the rows and columns of a given two-dimensional array.

Original Array:
10 20 30
40 50 60
After changing the rows and columns of the said array:10 40
20 50
30 60
 */

public class EX155 {
    public static void main(String[] args) {
        int[][] twodm = {
                {10, 20, 30},
                {40, 50, 60}
        };
        System.out.println("Original Array:");
        print_array(twodm);
        System.out.println("After changing the rows and columns of the said array:");
        transpose(twodm);
    }

    private static void transpose(int[][] twodm) {

        int[][] newtwodm = new int[twodm[0].length][twodm.length];

        for (int i = 0; i < twodm.length; i++) {
            for (int j = 0; j < twodm[0].length; j++) {
                newtwodm[j][i] = twodm[i][j];
            }
        }

        print_array(newtwodm);
    }

    private static void print_array(int[][] twodm) {
        for (int[] ints : twodm) {
            for (int j = 0; j < twodm[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

    }
}
