package com.gecg;

/*
Practical-24: Define MYPriorityQueue class that extends Priority Queue to implement the Cloneable interface
and implement the clone() method to clone a priority queue.
*/

import java.util.Date;
import java.util.PriorityQueue;

public class Practical_24 {

    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 24");
        System.out.println("Aim:- Define MYPriorityQueue class that extends Priority Queue to implement the Cloneable interface\n" +
                "and implement the clone() method to clone a priority queue.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        MyPriorityQueue<String> queue = new MyPriorityQueue<>();
        queue.offer("56");
        queue.offer("57");
        queue.offer("58");

        MyPriorityQueue<String> queue1 = null;
        try {
            queue1 = (MyPriorityQueue<String>)(queue.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.print(queue1);
    }

    static class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable {

        @Override
        public Object clone() throws CloneNotSupportedException {

            MyPriorityQueue<E> clone = new MyPriorityQueue<>();

            this.forEach(clone::offer);

            return clone;
        }

    }
}