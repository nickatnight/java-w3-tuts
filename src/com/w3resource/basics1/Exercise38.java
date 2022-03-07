package com.w3resource.basics1;


public class Exercise38 {
    private static final String s = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

    public static void main(String[] args) {
        int charCount = 0, intCount = 0, spaceCount = 0, otherCount = 0;

        System.out.println("The string is: " + s);

        for(int i=0;i < s.length();i++) {
            if(Character.isDigit(s.charAt(i))) {
                intCount++;
            } else if(Character.isLetter(s.charAt(i))) {
                charCount++;
            } else if(Character.isWhitespace(s.charAt(i))) {
                spaceCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("letter: " + charCount);
        System.out.println("space: " + spaceCount);
        System.out.println("number: " + intCount);
        System.out.println("other: " + otherCount);
    }
}
