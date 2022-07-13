//package com.gecg;
//import java.util.ArrayList;
//import java.util.Date;
//
///*
//Practical_14: Write a program that creates an Array List and adds a Loan object , a Date object , a string, and a
//        Circle object to the list, and use a loop to display all elements in the list by invoking the object’s to
//        String() method.
// */
//
//
//// Creating Class loan
//class Loan{
//    double amount;
//
//    //Creating constructor
//    Loan(double a){
//        this.amount = a;
//    }
//
//    //Using toString to convert anything into string
//    public String toString(){
//        return "Loan of amount: " + this.amount;
//    }
//}
//
////Creating Class circle
//class Circle{
//    double radius;
//
//    //Creating constructor
//    Circle(double r){
//        this.radius = r;
//    }
//
//    //Using toString to convert anything into string
//    public String toString(){
//        return "Radius of circle is: " + this.radius;
//    }
//
//}
//
//
//public class Practical_14 {
//    public static void main(String[] args) {
//
//        //driver code by Suryadip
//        System.out.println("*********************");
//        System.out.println("Practical No:- 14");
//        System.out.println("Aim:- Write a program that creates an Array List and adds a Loan object , a Date object , a string, and a\n" +
//                "        Circle object to the list, and use a loop to display all elements in the list by invoking the object’s to\n" +
//                "        String() method." +
//                "For ex: 3+4 and 3 + 4 are acceptable expressions.");
//        System.out.println("Enrollment No:- 200130107056");
//        System.out.println("Name:- Suryadipsinh Vaghela");
//        System.out.print("Date and time: ");
//        Date date = new Date();
//        System.out.println(date);
//        System.out.println("*********************");
//        System.out.println();
//
//        //Declaring array_list
//        ArrayList<Object> F_arr_list = new ArrayList<Object>();
//
//        //Adding elements to arraylist
//        F_arr_list.add(new Loan(10000.10));
//        F_arr_list.add(new Date());
//        F_arr_list.add("Displaying a String");
//        F_arr_list.add(new Circle(53.55));
//
//        //Printing elements
//        for(int i = 0;i<F_arr_list.size();i++)
//            System.out.println((F_arr_list.get(i)).toString());
//    }
//}
//
//
//
