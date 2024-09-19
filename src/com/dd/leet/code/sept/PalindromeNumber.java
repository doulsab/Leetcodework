package com.dd.leet.code.sept;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println("Enter number to check weather palindrome or not.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reversNum = ReverseNumber.reverseNumber(number);
        String msg = number == reversNum ? "Palindrome" : "Not a palindrome";
        System.out.println("Number " + number + " is -> " + msg);
    }
}
