package com.w3resource.basics1;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        double sum = 0;
        int total = 3;
        Scanner myObj = new Scanner(System.in);

        for(int i = 0; i < total;i++) {
            System.out.print("Input number: ");
            double num = myObj.nextDouble();
            sum += num;
        }
        System.out.print("Average: " + sum / 3);
    }
}
