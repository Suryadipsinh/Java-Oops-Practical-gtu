package com.gecg;

/*
Assignment-3-b: Write a Program in which the area of room is calculated and
the cost of white wash is also evaluated. Further, include the provision for window
on any type of the walls. The input regarding the parameters including length, breadth
and height of the room are taken through command line. If there is a window, then its parameter
including length and breadth are also taken through command line. If these input parameters are
below 1, then raise an exception; otherwise calculate the area and cost and display the result.
(note that in order to calculate the area of the room to be painted the area of window must be
deducted from the total of the room.)
 */

import java.util.Date;
import java.util.Scanner;

class Room {
    float length;
    float breadth;
    float Window_length;
    float Window_breadth;

    float Area() {

        return length * breadth;
    }

    float AreaOfwindow() {

        return Window_length * Window_breadth;
    }
}

public class Assignment_3_b {
    public static void main(String args[]) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Assignment-3-b");
        System.out.println("Aim: Write a Program in which the area of room is calculated and\n" +
                "the cost of white wash is also evaluated. Further, include the provision for window\n" +
                "on any type of the walls. The input regarding the parameters including length, breadth\n" +
                "and height of the room are taken through command line. If there is a window, then its parameter\n" +
                "including length and breadth are also taken through command line. If these input parameters are\n" +
                "below 1, then raise an exception; otherwise calculate the area and cost and display the result.\n" +
                "(note that in order to calculate the area of the room to be painted the area of window must be\n" +
                "deducted from the total of the room.)");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        int choice, Window;
        Room rooml = new Room();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Room Length In Meter: ");
        rooml.length = sc.nextFloat();
        System.out.println("Enter Room Breadth in Meter: ");
        rooml.breadth = sc.nextFloat();
        System.out.println("Room Area: " + rooml.Area() + " m2");

        System.out.println("Cost of whitewashing Wall is 15 Rupess per m2");

        System.out.println("Is any Window in your Room.?");
        System.out.println("IF yes Press 1 and If no Press 2");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("How many Windows are there in your Room.....?");
            Window = sc.nextInt();
            System.out.println("Enter the Window Length in meter: ");
            rooml.Window_length = sc.nextFloat();
            System.out.println("Enter the Window Breadth in meter: ");
            rooml.Window_breadth = sc.nextFloat();
            System.out.println("Window Area: " + rooml.AreaOfwindow() + " m2");

            System.out.println("Total Area to Whitewashing Wall in your Room is " + (rooml.Area() - Window*(rooml.AreaOfwindow())) + " m2");

            System.out.println("And total Cost is : " + (15*(rooml.Area() - Window*(rooml.AreaOfwindow()))));

        }
        else{

            System.out.println("Total Area to Whitewashing Wall in your Room is " + rooml.Area() + " m2");

            System.out.println("And total Cost is : " + 15*rooml.Area());
        }

    }
}
