package com.gecg;

import java.util.Date;
import java.util.Random;

/*
Practicle_12: Write a program that creates a Random object with seed 1000 and displays the first 100 random
integers between 1 and 49 using the NextInt (49) method.
*/

public class Practical_12 {
    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 12");
        System.out.println("Aim:- Write a program that creates a Random object with seed 1000 and displays the first 100 random\n" +
                "integers between 1 and 49 using the NextInt (49) method.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        /* creating random object with seed 1000 */
        Random random = new Random(1000);

        /*
         displaying the first 100 random
        integers between 1 and 49 using the NextInt (49)
        */
        for(int i = 0; i<100; i++){
            System.out.print(random.nextInt(49) + ", ");

            // for printing numbers in five lines
            if( (i % 20) == 0){
                System.out.println();
            }
        }
    }

}
