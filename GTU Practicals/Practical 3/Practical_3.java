package com.gecg;
import java.util.Date;
import java.util.Scanner;

/* Practicle_3: Write a program that reads a number in meters, converts it to feet, and displays the result. */

public class Practical_3 {
    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 3");
        System.out.println("Write a program that reads a number in meters, converts it to feet, and displays the result.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        /* taking input */
        System.out.print("Enter a number in meters to convert it into feet: ");
        double x = sc.nextDouble();

        /* Calculation */
        double feet;
        feet = x*(3.28084);

        /* answer printing */
        System.out.println(x + " meters = " + feet + " feets" );

    }
}
