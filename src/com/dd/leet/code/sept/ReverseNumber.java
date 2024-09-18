package com.dd.leet.code.sept;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println("Enter the number to reverse:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reversNum = 0;

        /**
         * Test Case I : number is 143.
         * itr 1: 143 > 0 : true,digit = 143 % 10 = 3, number = 143/10 (14.3) which both are int so 14 ,reversNum = 0*10+3 = 3.
         * itr 2: 14 > 0 : true ,digit = 14 % 10 = 4, number = 14/10 (1.4) which both are int so 1 ,reversNum = 3*10+4 = 34.
         * itr 3: 1 > 0 : true ,digit = 1 % 10 = 1, number = 1/10 (0.1) which both are int so 0,reversNum = 34*10+1 = 341.
         * itr 4: 0 > : false while loop will terminate.
         */
        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            reversNum = reversNum * 10 + digit;
        }
        System.out.println("Reverse of Num " + number + " is -> " + reversNum);
    }


}
