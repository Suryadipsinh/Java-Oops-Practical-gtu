package com.gecg;

/*
Practicle_11: Write a program that generate 6*6 two-dimensional matrix, filled with 0’s and 1’s , display the
matrix, check every row and column have an odd number’s of 1’s.
*/

import java.util.Date;

public class Practical_11 {

    /* method to check if all rows have odd numbers of 1s or not */
    public static boolean isRowOdd(int m[][]){
        int count = 0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                if(m[i][j] == 1)
                    count++;
            }
            if(count%2 == 0)
                return false;
        }
        return true;
    }

    /* method to check if all columns have odd numbers of 1s or not */
    public static boolean isColumnOdd(int m[][]){
        int count = 0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0 ; j<m.length; j++){
                if(m[i][j] == 1)
                    count++;
            }
            if( count%2 == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 11");
        System.out.println("Aim:- Write a program that generate 6*6 two-dimensional matrix, filled with 0’s and 1’s , display the\n" +
                "matrix, check every row and column have an odd number’s of 1’s.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        // declaring a 6*6 matrix(2D matrix);
        int matrix[][] = new int[6][6];

        // creating a 6*6 matrix
        for(int i = 0 ; i< matrix.length; i++){
            for(int j = 0 ; j< matrix.length; j++){
                matrix[i][j] = (int)(Math.random()*2);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // output for rows
        System.out.println("Every row " + (isRowOdd(matrix) ? "have odd no of 1s" : "dose not have odd no of 1s"));

        // output for columns
        System.out.println("Every column " + (isColumnOdd(matrix) ? "have odd no of 1s" : "does not have odd no of 1s"));
    }

}
