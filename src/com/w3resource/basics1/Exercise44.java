package com.w3resource.basics1;

import java.util.Scanner;

public class Exercise44 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = s.nextInt();
        System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
    }
}
