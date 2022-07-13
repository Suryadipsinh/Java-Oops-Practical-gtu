package com.gecg;
import java.util.Scanner;
import java.util.*;

/*
Practical-22:Write a recursive method that returns the smallest integer in an array. Write a test program that
prompts the user to enter an integer and display its product.
*/

class practical_22 {

    public static int MinimumUSingRec(int Array[], int num) {
        // if size = 0 means whole array
        // has been traversed
        if(num == 1)
            return Array[0];

        return Math.min(Array[num-1], MinimumUSingRec(Array, num-1));
    }

    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 22");
        System.out.println("Aim:- Write a recursive method that returns the smallest integer in an array. Write a test program that\n" +
                "prompts the user to enter an integer and display its product.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int product = 1;
        System.out.println("Enter five integers: ");
        int[] list = new int[5];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
            product *= list[i];
        }

        System.out.println("The Product of elements is " + product);

        System.out.println("The minimum number of these Five number is " + MinimumUSingRec(list, 5));
    }
}