package com.classProblems;

import java.util.Scanner;


public class LargestNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        double largest = num1 ;

        if(num2 > largest ){
            largest = num3;
        }
        if(num3 > largest){
            largest = num3;
        }

        System.out.println("The largest is " +largest);
        sc.close();
    }
}