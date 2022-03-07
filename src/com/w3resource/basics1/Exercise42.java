package com.w3resource.basics1;

import java.io.Console;

// check this
public class Exercise42 {
    public static void main(String[] args) {
        Console con;
        if((con = System.console()) != null) {
            char[] pass = null;
            try {
                pass = con.readPassword("Input your password");
                System.out.println("Your password was: " + new String(pass));
            } finally {
                if (pass != null) {
                    java.util.Arrays.fill(pass, ' ');
                }
            }
        } else {
            throw new RuntimeException("Can't get password..No console");
        }
    }
}
