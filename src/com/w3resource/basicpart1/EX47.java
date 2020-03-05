package com.w3resource.basicpart1;

/*
Write a Java program to display the current date time in specific format.
Sample Output:

Now: 2017/06/16 08:52:03.066
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EX47 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
