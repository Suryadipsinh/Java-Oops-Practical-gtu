package com.gecg;
import java.util.*;

/*
Practicle_9: Write a method with following method header.
public static int gcd(int num1, int num2)
Write a program that prompts the user to enter two integers and compute the gcd of two integers.
*/

public class Practical_9 {

    public static int gcd(int num1, int num2) {

        /* logic */
        while (num1 != num2) {
            if(num1 > num2)
                num1 = num1-num2;
            else
                num2 = num2 - num1;
        }
        return num1;
    }

    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 9");
        System.out.println("Aim:- Write a method with following method header.\n" +
                "public static int gcd(int num1, int num2)\n" +
                "Write a program that prompts the user to enter two integers and compute the gcd of two integers.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        /* taking input */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Integer: ");
        int num2 = sc.nextInt();

        /* printing answer */
        System.out.println("GCD of "+ num1 +" and "+ num2 +" is "+ gcd(num1,num2));
    }
}
