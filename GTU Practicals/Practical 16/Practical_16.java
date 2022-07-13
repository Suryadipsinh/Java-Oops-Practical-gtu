package com.gecg;
import java.util.Date;
import java.util.Scanner;

/*
Practical-16: Write a program that prompts the user to enter a decimal number and displays the number in a
fraction.
Hint: Read the decimal number as a string, extract the integer part and fractional part from the
string.
*/

class Fraction {
    private int real;
    private int imaginary;

    Fraction(int r, int i) {
        real = r;
        imaginary = i;
    }

    // finding the greatest common multiple using recursion
    public long GCM(long a, long b) {
        return b == 0 ? a : GCM(b, a % b);
    }

    public String toString() {
        long GCM = GCM(real, imaginary);
        return real / GCM + "/" + imaginary / GCM;
    }
}

public class Practical_16 {
    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 16");
        System.out.println("Aim:- Write a program that prompts the user to enter a decimal number and displays the number in a\n" +
                "fraction.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String decimal = sc.nextLine();

        // returns index position of decimal point (.)
        int indexofDec = decimal.indexOf(".");
        int len = decimal.substring(indexofDec).length();
        int img = (int) Math.pow(10, len - 1);
        int real = (int) (Double.parseDouble(decimal) * img);
        Fraction fr = new Fraction(real, img);
        System.out.println("The Fraction Number is " + fr);
    }
}

