package com.gecg;

/*
Assignment-2-a: Write a program to demonstrate the use of array of Objects and static variable.
 */

import java.util.Date;
import java.util.Scanner;

class student {
    Scanner sc = new Scanner(System.in);
    double sub1,sub2,sub3,per;
    String sname;
    static int i=0;//will get memory only once and retain its value

    //student class constructor
    student() {
        i++;//incrementing the value of static variable
        System.out.println("Enter name of student "+i+" : ");
        sname = sc.nextLine();
        System.out.println("Enter marks of "+sname+" in Physics (out of 100) : ");
        sub1=sc.nextDouble();
        System.out.println("Enter marks of "+sname+" in Chemistry (out of 100) : ");
        sub2=sc.nextDouble();
        System.out.println("Enter marks of "+sname+" in Maths (out of 100) : ");
        sub3=sc.nextDouble();
    }
    void percentage() {
        per = ((sub1+sub2+sub3)/300)*100;
        System.out.println("The percentage of "+sname+" is "+ per);
    }
}

public class Assignment_2_a {
    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Assignment-2-a");
        System.out.println("Aim: Write a program to demonstrate the use of array of Objects and static variable.\n");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        //create an array of product student
        student s[] = new student[2];
        for (int i=0; i<s.length; i++) {
            s[i] = new student();
            s[i].percentage();
        }
    }
}
