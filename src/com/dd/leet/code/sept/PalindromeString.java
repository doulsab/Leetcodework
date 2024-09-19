package com.dd.leet.code.sept;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Enter the string to reverse :");
        Scanner scanner = new Scanner(System.in);
        String enterString = scanner.nextLine();

        String reverseOfString = ReverseString.reverseAString(enterString);
        String msg = enterString.equals(reverseOfString) ? "Palindrome" : "Not a palindrome";
        System.out.println("Entered string :" + enterString + " is -> " + msg);
    }
}
