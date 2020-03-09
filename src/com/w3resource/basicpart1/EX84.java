package com.w3resource.basicpart1;

/*
Write a Java program to take the last three characters from a given string and
add the three characters at both the front and back of the string.
String length must be greater than three and more.
Test data: "Python" will be "honPythonhon"
Sample Output:

honPythonhon
 */

public class EX84 {
    public static void main(String[] args) {
        String data = "Python";
        String lastThree = data.substring(data.length() - 3);

        System.out.println(lastThree + data + lastThree);
    }
}
