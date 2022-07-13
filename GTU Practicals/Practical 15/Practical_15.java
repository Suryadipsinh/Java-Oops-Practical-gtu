package com.gecg;
import java.util.Date;
import java.util.Scanner;

/*
Practical_15: Write the bin2Dec (string binary String) method to convert a binary string into a decimal number.
Implement the bin2Dec method to throw a NumberFormatException if the string is not a binary string.
*/

public class Practical_15 {

    public static int bin2Dec(String binString) throws NumberFormatException {
        int decimal_value = 0;
        int strLength = binString.length();
        for (int i = 0; i < strLength; i++) {
            if (binString.charAt(i) < '0' || binString.charAt(i) > '1') {
                throw new NumberFormatException("Please Enter a Binary String");
            }
            decimal_value += (binString.charAt(i) - '0') * Math.pow(2, strLength - i - 1);
        }
        return decimal_value;
    }

    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 15");
        System.out.println("Aim:- Write the bin2Dec (string binary String) method to convert a binary string into a decimal number.\n" +
                "Implement the bin2Dec method to throw a NumberFormatException if the string is not a binary string.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Value to convert into decimal : ");
        String str = sc.nextLine();
        try{
            System.out.println("Decimal Value = " + bin2Dec(str));
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }

    }
}