package com.w3resource.basics1;

import java.util.Scanner;

public class Exercise37 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String newStr = "";

        System.out.print("Input a string: ");
        String input = s.nextLine();

        for(int i=input.length()-1;i >=0; i--) {
            newStr += input.charAt(i);
        }

        System.out.println(newStr);
    }
}
