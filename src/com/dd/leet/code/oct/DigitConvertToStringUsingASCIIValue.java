package com.dd.leet.code.oct;

import java.util.Scanner;

public class DigitConvertToStringUsingASCIIValue {
    private static String[] words = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to convert :");
        int input = scanner.nextInt();
        String convertWord = convertToStringMethod(input);
        System.out.println("Converted Word :" + convertWord);
        scanner.close();
    }

    private static String convertToStringMethod(int input) {
        String abcs = String.valueOf(input);
        StringBuilder sb = new StringBuilder();
        for (char ch : abcs.toCharArray()) {
            int asciiValue = ch - '0';
            sb.append(words[asciiValue]).append(" ");
        }
        return sb.toString().trim();
    }
}
