package com.w3resource.basics1;

import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input the number of sides of a polygon: ");
        double numSides = myObj.nextDouble();

        System.out.print("Input the length of one of the sides: ");
        double sideLength = myObj.nextDouble();

        System.out.println("The area of the polygon is: " + computeAreaPolygon(numSides, sideLength));

    }

    public static double computeAreaPolygon(double sides, double length) {
        double area = (sides * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / sides));
        return area;
    }
}
