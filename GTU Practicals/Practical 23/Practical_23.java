package com.gecg;

/*
Practical-23: Write a generic method that returns the minimum elements in a two dimensional array.
*/

import java.util.*;

public class Practical_23 {
    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 23");
        System.out.println("Aim:- Write a generic method that returns the minimum elements in a two dimensional array.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        Integer list[][] = new Integer[3][3];
        Scanner sc = new Scanner(System.in);
        int value = 1;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.println("Enter " + value + " Number:-");
                list[i][j] = sc.nextInt();
                value++;

            }
        }
        System.out.println("Minimum no is = " + min(list));
    }

    public static <E extends Comparable<E>> E min(E list[][]) {
        E min = list[0][0];
        for (E[] elements : list) {
            for (E element : elements) {
                if (element.compareTo(min) < 0) {
                    min = element;
                }
            }
        }
        return min;
    }
}