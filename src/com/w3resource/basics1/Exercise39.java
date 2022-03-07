package com.w3resource.basics1;

public class Exercise39 {
    public static void main(String[] args) {
        int total = 0;

        // brute force
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                for(int k=0;k<4;k++) {
                    if(i != j && j != k && i != k) {
                        total++;
                        System.out.printf("[%d,%d,%d]\n", i, j, k);
                    }
                }
            }
        }
        System.out.printf("Total: %d", total);
    }
}
