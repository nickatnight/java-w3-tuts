package com.w3resource.basics1;

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long num = myObj.nextLong();

        System.out.printf("The sum of the digits is: %d\n", sumIntegers(num));
    }

    public static int sumIntegers(long userInput) {
        int sum = 0;

        while(userInput != 0) {
            sum += userInput % 10;
            userInput /= 10;
        }

        return sum;
    }
}
