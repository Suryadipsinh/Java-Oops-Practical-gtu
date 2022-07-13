package com.gecg;

/*
import java.util.Scanner;
Practicle_7:  Assume a vehicle plate number consists of three uppercase letters followed by four digits. Write a
program to generate a plate number.
*/

import java.util.Date;

public class Practical_7 {
    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 7");
        System.out.println("Assume a vehicle plate number consists of three uppercase letters followed by four digits. Write a\n" +
                "program to generate a plate number.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();
        
        /* Generating random letters */
        int letter1 = 'A' + (int)(Math.random() * ('Z' - 'A'));
        int letter2 = 'A' + (int)(Math.random() * ('Z' - 'A'));
        int letter3 = 'A' + (int)(Math.random() * ('Z' - 'A'));

        /* Generating random numbers */
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random()* 10);
        int num3 = (int)(Math.random()* 10);
        int num4 = (int)(Math.random()* 10);

        /* Displaying plate number: 3 let + 4 num */
        System.out.println("" + (char)(letter1) + (char)(letter2) + (char)(letter3) + (int)(num1)+ (int)(num2)+ (int)(num3)+ (int)(num4));
    }
}
