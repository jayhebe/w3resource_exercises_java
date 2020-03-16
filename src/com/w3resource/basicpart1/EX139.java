package com.w3resource.basicpart1;

/*
Write a Java program to get the index of the first number and the last number of a subarray
where the sum of numbers is zero from a given array of integers.
Original Array : [1, 2, 3, -6, 5, 4]
Index of the subarray of the said array where the sum of numbers is zero: [0, 3]
 */

import java.util.*;

public class EX139 {
    public static List<Integer> subarraySum(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return temp;
        }
        int pre_Sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(pre_Sum, -1);
        for (int i = 0; i < nums.length; i++) {
            pre_Sum += nums[i];
            if (map.containsKey(pre_Sum)) {
                temp.add(map.get(pre_Sum) + 1);
                temp.add(i);
                return temp;
            }
            map.put(pre_Sum, i);
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -6, 5, 4};
        System.out.println("Original Array : " + Arrays.toString(nums));
        System.out.println("Index of the subarray of the said array where the sum of numbers is zero: " + subarraySum(nums));
    }
}
