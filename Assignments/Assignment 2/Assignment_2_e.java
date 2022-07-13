package com.gecg;

/*
Assignment-2-e:	Write a program to implement an Abstract class Shape which
contains Abstract method Area(). Create two other classes Circle and Square which
overrides the method Area() and find the area of rectangle and square in respective
classes. Write demo class
 */

import java.util.Date;

abstract class Shape {
    public abstract double area();
}

class Rectangle extends Shape {
    private final double width, length; // sides

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        // A = w * l
        return width * length;
    }

}

class Circle extends Shape {
    private final double radius;
    final double pi = Math.PI;

    public Circle() {
        this(1);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // A = π r^2
        return pi * Math.pow(radius, 2);
    }

}

public class Assignment_2_e {
    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Assignment-2-e");
        System.out.println("Aim: Write a program to implement an Abstract class Shape which\n" +
                "contains Abstract method Area(). Create two other classes Circle and Square which\n" +
                "overrides the method Area() and find the area of rectangle and square in respective\n" +
                "classes. Write demo class");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();


        // Rectangle test
        double width = 5, length = 6;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length + "\nResulting area: " + rectangle.area()+  "\n");

        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius+ "\nResulting Area: " + circle.area() + "\n");

    }
}
