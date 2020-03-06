package com.w3resource.basicpart1;

/*
Write a Java program to convert seconds to hour, minute and seconds.
Sample Output:

Input seconds: 86399
23:59:59
 */

import java.util.Scanner;

public class EX55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int seconds = scanner.nextInt();

        System.out.println(secondToHours(seconds));
    }

    public static String secondToHours(int seconds) {
        int hour = seconds / 60 / 60;
        int minute = seconds / 60 % 60;
        int second = seconds % 60;

        return hour + ":" + minute + ":" + second;
    }
}
