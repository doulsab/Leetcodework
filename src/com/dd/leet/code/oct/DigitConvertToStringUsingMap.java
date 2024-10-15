package com.dd.leet.code.oct;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DigitConvertToStringUsingMap {
  private static Map<Character,String> wordsMap = new HashMap<>();

    static {
        wordsMap.put('0', "zero");
        wordsMap.put('1', "one");
        wordsMap.put('2', "two");
        wordsMap.put('3', "three");
        wordsMap.put('4', "four");
        wordsMap.put('5', "five");
        wordsMap.put('6', "six");
        wordsMap.put('7', "seven");
        wordsMap.put('8', "eight");
        wordsMap.put('9', "nine");
    }

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
            sb.append(wordsMap.get(ch)).append(" ");
        }
        return sb.toString().trim();
    }
}
