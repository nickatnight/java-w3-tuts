package com.w3resource.basics1;

import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input the side of a hexagon: ");
        double side = myObj.nextDouble();

        System.out.println("The area of the hexagon is: " + computeAreaHexagon(side));

    }

    public static double computeAreaHexagon(double side) {
        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
        return area;
    }
}
