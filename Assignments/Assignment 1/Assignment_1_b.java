package com.gecg;
import java.util.Date;
import java.util.Scanner;

/*
Assignment-1-b: Write a test program that prompts the user to enter ten numbers,
invokes a method to reverse the numbers, and displays the numbers.
 */

public class Assignment_1_b {

    public static void ReverseTheNumbers(int[] arr) {
        System.out.println("Given numbers in reverse order: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Assignment-1-b");
        System.out.println("Aim: Write a test program that prompts the user to enter ten numbers,\n" +
                "invokes a method to reverse the numbers, and displays the numbers.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        System.out.println("Enter 10 Numbers: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        ReverseTheNumbers(arr);
    }
}
