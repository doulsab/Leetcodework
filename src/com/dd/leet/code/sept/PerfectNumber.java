package com.dd.leet.code.sept;

import java.util.Scanner;

/**
 * @author DD
 */
public class PerfectNumber {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter upto number :");
        doPerfectNumber(cs.nextInt());
    }

    private static void doPerfectNumber(int items) {
        for (int i = 0; i < items; i++) {
            if (checkIsPerpectNo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
/*
Test Case : I
 < = 100
 num is 6 : length is 6 :
 Itr 1  i == 2 :  6/2 = 0
 sum = (sum + i )
 sum = 1 + 2 = 3
 Itr 2 i == 3 : 6/3 = 0
 sum = 3+ 3 = 6
 Itr 3 i == 4  : 6/4 != 0
 sum = 6
 Itr 4 i == 5  : 6/5 != 0
 sum = 6
 Itr 5 i = 6 6<6 terninate the loop.
 sum == num i.e 6 == 6.
 */
    private static boolean checkIsPerpectNo(int num) {
        int sum = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
