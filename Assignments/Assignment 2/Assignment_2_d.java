package com.gecg;
import java.util.*;

/*
Assignment-2-d:	Write a program that illustrates interface inheritance. Interface P is
extended by P1 and P2. Interface P12 inherited from both p1 and p2. Each interface declares
constant and one method. Class Q implements P12. Instantiate Q and invoke each of its method.
Each method displays one of the constants.
 */

import java.util.Date;

interface P {
    final int p = 56;
    void DisplayP();

}

interface P1 extends P {
    final int p1 = 57;
    void DisplayP1();
}

interface P2 extends P {
    final int p2 = 58;
    void DisplayP2();
}

interface P12 extends P1, P2 {
    final int p12 = 59;
    void DisplayP12();
}

class Q implements P12 {
    public void DisplayP() {
        System.out.println("Display P : " + p1);
    }

    public void DisplayP1() {
        System.out.println("Display P1 : " + p2);
    }

    public void DisplayP2() {
        System.out.println("Display P2 : " + p12);
    }

    public void DisplayP12() {
        System.out.println("Display P12 : " + p);
    }

}

class Assignment_2_d {

    public static void main(String arg[]) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Assignment-2-d");
        System.out.println("Aim: Write a program that illustrates interface inheritance. Interface P is\n" +
                "extended by P1 and P2. Interface P12 inherited from both p1 and p2. Each interface declares\n" +
                "constant and one method. Class Q implements P12. Instantiate Q and invoke each of its method.\n" +
                "Each method displays one of the constants.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        Q q = new Q();
        q.DisplayP();
        q.DisplayP1();
        q.DisplayP2();
        q.DisplayP12();
    }
}