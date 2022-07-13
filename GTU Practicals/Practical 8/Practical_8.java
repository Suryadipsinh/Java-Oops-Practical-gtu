package com.gecg;
import java.util.Date;
import java.util.Scanner;

/*
Practicle_8: Write a program that reads an integer and displays all its smallest factors in increasing order. For
example if input number is 120, the output should be as follows:2,2,2,3,5.
*/

public class Practical_8 {
    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 8");
        System.out.println("Write a program that reads an integer and displays all its smallest factors in increasing order. For\n" +
                "example if input number is 120, the output should be as follows:2,2,2,3,5.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        /* Declaring index */
        int index =2;
        Scanner input = new Scanner(System.in);

        /* taking input from user */
        System.out.print("Enter a number to find its factors : ");
        int num = input.nextInt();

        /* logic */
        while(num > 1)
        {
            if(num%index==0)
            {
                System.out.print(index+",");
                num=num/index;
            }
            else
                index++;
        }

    }
}



