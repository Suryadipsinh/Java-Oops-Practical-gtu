package com.gecg;

/*
Practical_13: Write a program for calculator to accept an expression as a string in which the operands and
operator are separated by zero or more spaces.
For ex: 3+4 and 3 + 4 are acceptable expressions.
*/

import java.util.Date;
import java.util.Scanner;

public class Practical_13 {
    public static void main(String[] args)
    {
        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 13");
        System.out.println("Aim:- Write a program for calculator to accept an expression as a string in which the operands and\n" +
                "operator are separated by zero or more spaces.\n" +
                "For ex: 3+4 and 3 + 4 are acceptable expressions.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Equation : ");
        String string = input.nextLine();
        String a = string.replaceAll(" ","");

        if (a.length() < 3) {
            System.out.println(
                    "Minimum 2 Opearator and 1 Opearand Required");
            System.exit(0);
        }

        int result = 0;
        int i = 0;
        while(a.charAt(i)!='+' && a.charAt(i)!='-' && a.charAt(i)!='*' && a.charAt(i)!='/')
        {
            i++;
        }

        switch (a.charAt(i)) {
            case '+' :
                result = Integer.parseInt(a.substring(0,i))+Integer.parseInt(a.substring(i+1,a.length()));
                break;
            case '-' :
                result = Integer.parseInt(a.substring(0,i))-Integer.parseInt(a.substring(i+1,a.length()));
                break;
            case '*' :
                result = Integer.parseInt(a.substring(0,i))*Integer.parseInt(a.substring(i+1,a.length()));
                break;
            case '/' :
                result = Integer.parseInt(a.substring(0,i))/Integer.parseInt(a.substring(i+1,a.length()));
                break;
        }
        System.out.println(a.substring(0,i) + ' ' + a.charAt(i) + ' ' + a.substring(i+1,a.length())
                + " = " + result);
    }

}

