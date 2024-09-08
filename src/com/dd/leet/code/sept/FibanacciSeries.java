package com.dd.leet.code.sept;

import java.util.Scanner;

/**
 * @author DD
 */
public class FibanacciSeries {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter Upto numbers to print the FS :");
        int items = cs.nextInt();
        doFibbonaccciSeries(items);
    }

//    F(n) = F(n-1) + F(n-2) n>1
    private static void doFibbonaccciSeries(int numOfItret) {
        if (numOfItret > 0) {
            int prev = 0, next = 1;
            System.out.print("Fibonacci Series : " + prev + " " + next);
            for (int i = 0; i < numOfItret; i++) {
                int temp = prev + next;
                System.out.print(" " + temp);
                prev = next;
                next = temp;
            }
            System.out.println();
        }

    }

}
