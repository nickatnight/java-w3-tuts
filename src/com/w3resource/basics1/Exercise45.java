package com.w3resource.basics1;

import java.io.File;

public class Exercise45 {
    public static void main(String[] args) {
        String basePath = System.getProperty("user.dir");
        String fileName = basePath + "/README.md";
        File f = new File(fileName);
        long fileSize = f.length();

        System.out.printf("%s : %d\n", fileName, fileSize);  // defaults to 0 if file doesn't exist
    }
}
