package com.gecg;
import java.util.Date;
import java.util.Scanner;

/*
Practicle_10:  Write a test program that prompts the user to enter ten numbers, invoke a method to reverse the
numbers, display the numbers.
*/

public class Practical_10 {

    //Method to reverse numbers
    public static void reverseNumbers(int arr[], int start, int end){
        int temp;

        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    //Method to print array
    public static void printNumbers(int arr[]){
        for(int i = 0; i< arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 10");
        System.out.println("Aim:- Write a test program that prompts the user to enter ten numbers, invoke a method to reverse the\n" +
                "numbers, display the numbers.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        //declaring array
        int i = 0;
        int num_arr[] = new int[10];

        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter ten numbers: ");

        for(i = 0; i<10; i++){
            System.out.print("Enter at position " + (i+1)+ " : ");
            num_arr[i] = sc.nextInt();
        }

        System.out.print("Numbers in original order : ");
        printNumbers(num_arr);
        reverseNumbers(num_arr, 0, 9);
        System.out.print("Numbers in reverse order : ");
        printNumbers(num_arr);

    }

}