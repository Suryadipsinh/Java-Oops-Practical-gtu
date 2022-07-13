package com.gecg;

/*
Assignment-3-a: Write a Program to demonstrate the use of Multithreading.
 */

import java.lang.*;
import java.util.Date;

class FirstThread extends Thread {
    public void run() {
        for(int i=0; i<4; i++) {
            try {
                if(i == 3) {
                    sleep(4000);
                }
            }
            catch(Exception x) { }
            System.out.println(i);
        }
        System.out.println(" First Thread Finished ");
    }
}
class SecondThread extends Thread {
    public void run() {
        for(int i=0; i<4; i++) {
            System.out.println(i);
        }
        System.out.println(" Second Thread Finished ");
    }
}
class ThirdThread extends Thread {
    public void run() {
        for(int i=0; i<4; i++) {
            System.out.println(i);
        }
        System.out.println(" Third Thread Finished ");
    }
}
class Assignment_3_a {
    public static void main(String arg[]) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Assignment-3-a");
        System.out.println("Aim: write a Program to demonstrate the use of Multithreading.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        FirstThread a1 = new FirstThread();
        SecondThread b1 = new SecondThread();
        ThirdThread c1 = new ThirdThread();
        a1.start();
        b1.start();
        c1.start();
    }
}