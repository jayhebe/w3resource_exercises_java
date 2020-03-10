package com.w3resource.basicpart1;

/*
Write a Java program to check if the value 20 appears three times and no 20's are next to each other
in an given array of integers.
 */

import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;

public class EX98 {
    public static void main(String[] args) {
        List<Integer> indexes = new ArrayList<>();
        int[] arr = {73, 12, 20, 20, 17, 20, 35, 89, 108, 66, 92};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 20) {
                indexes.add(i);
            }
        }

        if (indexes.size() == 3) {
            if ((indexes.get(2) - indexes.get(1) != 1) && (indexes.get(1) - indexes.get(0)) != 1) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } else {
            System.out.println(false);
        }
    }
}
