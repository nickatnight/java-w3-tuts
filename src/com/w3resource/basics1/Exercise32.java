package com.w3resource.basics1;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int firstInt, secondInt;

        System.out.println("Input first integer: ");
        firstInt = myObj.nextInt();

        System.out.println("Input second integer: ");
        secondInt = myObj.nextInt();

        if(firstInt == secondInt) {
            System.out.printf("%d == %d\n", firstInt, secondInt);
        }
        if(firstInt != secondInt) {
            System.out.printf("%d != %d\n", firstInt, secondInt);
        }
        if(firstInt < secondInt) {
            System.out.printf("%d < %d\n", firstInt, secondInt);
        }
        if(firstInt <= secondInt) {
            System.out.printf("%d <= %d\n", firstInt, secondInt);
        }
        if(firstInt > secondInt) {
            System.out.printf("%d > %d\n", firstInt, secondInt);
        }
        if(firstInt >= secondInt) {
            System.out.printf("%d >= %d\n", firstInt, secondInt);
        }
    }
}
