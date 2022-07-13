package com.gecg;

/*
Assignment-2-f:	•	Write an application that illustrates how a method can invoke a super
 class method. Class I2 is extended by J2. Class J2 is extended by K2. Each of these class
 defines a getDescription() method that returns a string. That String includes a description
 of the class plus descriptions of each super class. Instantiate each object of these classes
 and invoke the getDescription () method.
 */

import java.util.Date;

class I2 {
    void getDescription() {
        String s = "This is a statement from class I2";
        System.out.println(s);
    }
}

class J2 extends I2 {
    void getDescription() {
        super.getDescription();
        String s = "This is a statement from class J2";
        System.out.println(s);
    }
}

class K2 extends J2 {
    void getDescription() {
        super.getDescription();
        String s = "This is a statement from class K2";
        System.out.println(s);
    }
}

public class Assignment_2_f {
    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Assignment-2-f");
        System.out.println("Aim: Write an application that illustrates how a method can invoke a super\n" +
                " class method. Class I2 is extended by J2. Class J2 is extended by K2. Each of these class\n" +
                " defines a getDescription() method that returns a string. That String includes a description\n" +
                " of the class plus descriptions of each super class. Instantiate each object of these classes\n" +
                " and invoke the getDescription () method.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        I2 i = new I2();
        J2 j = new J2();
        K2 k = new K2();
        i.getDescription();
        j.getDescription();
        k.getDescription();
    }
}
