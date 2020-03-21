package com.w3resource.basicpart1;

/*
Write a Java program to find a path from top left to bottom in right direction which minimizes
the sum of all numbers along its path.
Note: Move either down or right at any point in time.
Sample Output: Sum of all numbers along its path: 13
 */

public class EX133 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {7, 4, 2},
                {0, 5, 6},
                {3, 1, 2}
        };

        System.out.println(getMinimumSum(grid));
    }

    private static int getMinimumSum(int[][] grid) {
        int sum = 0;

        sum += grid[0][0];
        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid[i].length - 1; j++) {
                sum += (Math.min(grid[i][j + 1], grid[i + 1][j]));
            }
        }

        return sum;
    }
}
