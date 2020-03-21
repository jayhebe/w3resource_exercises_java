package com.w3resource.basicpart2;

/*
Write a Java program to print the contents of a two-dimensional Boolean array where t will
represent true and f will represent false.

Sample array:
array = {{true, false, true},
{false, true, false}};
Expected Output :
t f t
f t f
 */

public class EX154 {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true, false, true},
                {false, true, false}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == true) {
                    System.out.print("t ");
                } else {
                    System.out.print("f ");
                }
            }
            System.out.println();
        }
    }
}
