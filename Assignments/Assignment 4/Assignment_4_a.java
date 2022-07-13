package com.gecg;

/*
Assignment-4-a: Create a class called Student. Write a student
manager program to manipulate the student information from files by
using FileInputStream and FileOutputStream.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

public class Assignment_4_a {

    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Assignment-4-a");
        System.out.println("Aim: Create a class called Student. Write a student\n" +
                        "manager program to manipulate the student information from files by\n" +
                        "using FileInputStream and FileOutputStream.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        System.out.println("-------Writing Data in File-------");
        try {
            FileOutputStream fout = new FileOutputStream("stdinfo.txt");
            String str = "Name : Suryadipsinh Vaghela , Stream : Computer Engineering, Sem : 4th Sem";
            byte b[] = str.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Successful write.");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("-------Retriving Data From File-------");
        try {
            FileInputStream fin = new FileInputStream("stdinfo.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}