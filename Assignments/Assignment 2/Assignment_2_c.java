package com.gecg;

/*
Assignment-2-c:	The Airplane class has three subclasses named B747, B757, and B767.
Each plane type can transport different no. of passengers. Each airplane object has a unique
serial no. Write an application that declares this class hierarchy. Instantiate several types
of airplanes and display them. Override the toString() method of object to return a string with
the type, serial no. and capacity.
 */

import java.util.Date;

abstract class Airplane {
    protected int serialNumber;
    protected int passengerCapacity;
    protected String name;

    Airplane(int sn, String nm, int pc) {
        serialNumber = sn;
        name = nm;
        passengerCapacity = pc;
    }

    public String toString() {
        return "serial number : " + serialNumber + "  \n passenger capacity : " +

                passengerCapacity + " \n  name : " + name;

    }
}

class B747 extends Airplane {
    B747(int sn, String nm, int pc) {
        super(sn, nm, pc);
    }
}

class B757 extends Airplane {
    B757(int sn, String nm, int pc) {
        super(sn, nm, pc);
    }
}

class B767 extends Airplane {
    B767(int sn, String nm, int pc) {
        super(sn, nm, pc);
    }
}

class Assignment_2_c {
    public static void main(String args[]) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Assignment-2-c");
        System.out.println("Aim: \tThe Airplane class has three subclasses named B747, B757, and B767.\n" +
                "Each plane type can transport different no. of passengers. Each airplane object has a unique\n" +
                "serial no. Write an application that declares this class hierarchy. Instantiate several types\n" +
                "of airplanes and display them. Override the toString() method of object to return a string with\n" +
                "the type, serial no. and capacity.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        B747 b1 = new B747(001, "Kingfisher", 100);
        B757 b2 = new B757(101, "IndianAirlines", 2);

        System.out.println(b1.toString());
        System.out.println(b2.toString());

    }
}