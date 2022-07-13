package com.gecg;
import java.util.Date;
import java.util.Scanner;

/*
 Practicle_5: Write a program that prompts the user to enter three integers and display the integers in decreasing
order.
*/

public class Practical_5 {
    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 5");
        System.out.println("Write a program that prompts the user to enter three integers and display the integers in decreasing\n" +
                "order.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int temp;

        /* Taking user input */
        System.out.println("Enter three integers one by one: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        /* Logic */
        if((a>=b) && (a>=c)){
            if(b>=c)
                System.out.println("Decreasing order: " + a + " " + b + " " + c);
            else
                System.out.println("Decreasing order: " + a + " " + c + " " + b);
        }
        else if((b>=a) && (b>=c)){
            if(a>=c)
                System.out.println("Decreasing order: " + b + " " + a + " " + c);
            else
                System.out.println("Decreasing order: " + b + " " + c + " " + a);
        }
        else if((c>=a) && (c>=b)){
            if(a>=b)
                System.out.println("Decreasing order: " + c + " " + a + " " + b);
            else
                System.out.println("Decreasing order: " + c + " " + b + " " + a);
        }
    }

}
