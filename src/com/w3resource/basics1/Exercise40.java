package com.w3resource.basics1;

import java.nio.charset.Charset;

public class Exercise40 {
    public static void main(String[] args) {
        System.out.println("Available charsets:");
        for(String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
    }
}
