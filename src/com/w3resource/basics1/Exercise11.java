package com.w3resource.basics1;

public class Exercise11 {
    private static final double radius = 7.5;

    public static void main(String[] args) {
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
