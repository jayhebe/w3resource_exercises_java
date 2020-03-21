package com.w3resource.basicpart1;

/*
Write a Java program to find all of the longest word in a given dictionary.
Example-1:
{
"cat",
"flag",
"green",
"country",
"w3resource"
}
Result: "w3resource"
Example-2:
{
"cat",
"dog",
"red",
"is",
"am"
}
Result: "cat", "dog", "red"
 */

import java.util.ArrayList;
import java.util.List;

public class EX138 {
    public static void main(String[] args) {
        String[] dict1 = {"cat", "flag", "green", "country", "w3resource"};
        String[] dict2 = {"cat", "dog", "red", "is", "am"};

        List<String> result1 = getLongest(dict1);
        List<String> result2 = getLongest(dict2);

        System.out.println(result1.toString());
        System.out.println(result2.toString());
    }

    private static ArrayList<String> getLongest(String[] dict) {
        int len = 0;
        ArrayList<String> result = new ArrayList<>();

        for (String s : dict) {
            if (s.length() > len) {
                len = s.length();
            }
        }

        for (String s : dict) {
            if (s.length() == len) {
                result.add(s);
            }
        }

        return result;
    }
}
