package com.gecg;
import java.util.Date;
import java.util.Scanner;

/*
 Practicle_6: Write a program that prompts the user to enter a letter and check whether a letter is a vowel or
constant.
*/

public class Practical_6 {
    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 6");
        System.out.println("Write a program that prompts the user to enter a letter and check whether a letter is a vowel or\n" +
                "constant.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        /* taking character as input */
        System.out.print("Enter a character to check: ");
        char ch = sc.next().charAt(0);

        /* logic */
        if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is constant");
    }
}
