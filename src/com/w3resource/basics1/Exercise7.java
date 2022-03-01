package com.w3resource.basics1;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Input a number: ");
        int firstNum = myObj.nextInt();

        for(int i=1;i <= 10;i++) {
            System.out.println(firstNum * i);
        }
    }
}
