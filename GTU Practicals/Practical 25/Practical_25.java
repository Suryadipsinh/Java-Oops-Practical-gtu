package com.gecg;

/*
Practical-25: Write a program that reads words from a text file and displays all the nonduplicate words in
descending order. The text file is passed as a command-line argument.
*/

import java.io.*;
import java.util.*;

class Practical_25
{
    public static void main(String[] args) throws Exception
    {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 25");
        System.out.println("Aim:- Write a program that reads words from a text file and displays all the nonduplicate words in\n" +
                "descending order.The text file is passed as a command-line argument.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        if(args.length==1){
            String fileName = args[0];
            TreeSet<String> set = new TreeSet<>();
            File file = new File(fileName);
            try {
                Scanner sc = new Scanner(file);
                while (sc.hasNext()){
                    set.add(sc.next());
                }
                System.out.println(set);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Please, Pass the File Name as Command Line Argument");
        }
    }
}
