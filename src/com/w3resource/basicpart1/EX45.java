package com.w3resource.basicpart1;

/*
Write a Java program to find the size of a specified file.
Sample Output:

/home/students/abc.txt  : 0 bytes
/home/students/test.txt : 0 bytes
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class EX45 {
    public static void main(String[] args) {
//        int fileSize = 0;
//        File file = null;
//        FileInputStream fis = null;
//        try {
//            fileSize = 0;
//            file = new File("/home/students/abc.txt");
//            fis = new FileInputStream(file);
//            while (fis.read() != -1) {
//                fileSize++;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (fis != null) {
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        System.out.println(file.getPath() + ": " + fileSize + " bytes");

        File file = new File("/home/students/abc.txt");
        System.out.println(file.getPath() + ": " + file.length() + " bytes");
    }
}
