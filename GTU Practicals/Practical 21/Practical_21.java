package com.gecg;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

/*
Practical-21: Write a program to create a file name 123.txt, if it does not exist. Append a new data to it if it
already exists. write 150 integers created randomly into the file using Text I/O. Integers are
separated by space.
*/

public class Practical_21 {
    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 21");
        System.out.println("Aim:- Write a program to create a file name 123.txt, if it does not exist. Append a new data to it if it\n" +
                "already exists. write 150 integers created randomly into the file using Text I/O. Integers are\n" +
                "separated by space.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        try (
                PrintWriter pw = new PrintWriter(new FileOutputStream(new File("123.txt"), true));
        ) {
            for (int i = 0; i < 150; i++) {
                pw.print((int)(Math.random() * 100) + " ");
            }
        }
        catch (FileNotFoundException fnfe) {
            System.out.println("Cannot create the file.");
            fnfe.printStackTrace();
        }
    }

}
