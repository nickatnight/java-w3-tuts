package com.w3resource.basics1;

public class Exercise15 {
    public static void main(String[] args) {
        int a, b , temp;
        a = 7;
        b = 9;
        System.out.println("Before swap: a=" + a + " b=" + b);

        temp = b;
        b = a;
        a = temp;

        System.out.println("After swap: a=" + a + " b=" + b);
    }
}
