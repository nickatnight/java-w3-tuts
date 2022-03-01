package com.w3resource.basics1;

import java.util.Scanner;

public class Exercise36 {
    private static final double radius = 6371.01;

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate 1: ");
        double x1 = myObj.nextDouble();

        System.out.print("Input the longitude of coordinate 1: ");
        double y1 = myObj.nextDouble();

        System.out.print("Input the latitude of coordinate 2: ");
        double x2 = myObj.nextDouble();

        System.out.print("Input the longitude of coordinate 2: ");
        double y2 = myObj.nextDouble();

        System.out.println("The distance between these two points is: " + computeDistance(x1, y1, x2, y2) + " km");

    }

    public static double computeDistance(double x1, double y1, double x2, double y2) {
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        return radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2));
    }
}
