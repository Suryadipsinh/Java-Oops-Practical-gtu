package com.gecg;
import java.util.Date;
import java.util.Scanner;

/*
Practicle_4:  Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your
weight in kilograms and dividing by the square of your height in meters. Write a program that
prompts the user to enter a weight in pounds and height in inches and displays the BMI.
Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters.
*/

public class Practical_4 {
    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 4");
        System.out.println("Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your\n" +
                "weight in kilograms and dividing by the square of your height in meters. Write a program that\n" +
                "prompts the user to enter a weight in pounds and height in inches and displays the BMI.\n" +
                "Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        /* taking input from user */
        System.out.print("Enter your weight in pounds: ");
        double w = sc.nextDouble();
        System.out.print("Enter your height in inches: ");
        double h = sc.nextDouble();

        /* calculations */
        double BMI = (w*.45359237)/((h*.0254)*(h*.0254));

        /* Answer printing */
        System.out.println("BMI = "+ BMI);

    }

}
