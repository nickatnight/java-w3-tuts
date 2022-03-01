package com.w3resource.basics1;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Input first number: ");
        int firstNum = myObj.nextInt();

        System.out.print("Input second number: ");
        int secondNum = myObj.nextInt();

        System.out.println(firstNum + secondNum);
        System.out.println(firstNum - secondNum);
        System.out.println(firstNum * secondNum);
        System.out.println(firstNum / secondNum);
        System.out.println(firstNum % secondNum);
    }
}
