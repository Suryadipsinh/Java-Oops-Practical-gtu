package com.gecg;

/*
Assignment-1-a: Write a program that reads a number in meters, converts it to feet, and displays the result using a command-line argument.
 */

import java.util.Date;

public class Assignment_1_a {
    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Assignment-1-a");
        System.out.println("Write a program that reads a number in meters, converts it to feet, " +
                        "and displays the result using a command-line argument.\n");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        double m;
        System.out.println("Enter the value in meters: " + args[0]);
        m =Integer.parseInt(args[0]);
        System.out.println("Value in feet is " + (m*3.37));
    }

}
