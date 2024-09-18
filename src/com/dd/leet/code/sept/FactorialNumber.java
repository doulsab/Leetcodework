package com.dd.leet.code.sept;


import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter a number to find factorial Of :");
        int item = cs.nextInt();
        int factorialIs = doFactorialOfNumber(item);
        System.out.println("Factorial of number is " + factorialIs);
    }
// Test case I
  /*
  *
  * For item = 5, this will compute:
        5 * doFactorialOfNumber(4)
        4 * doFactorialOfNumber(3)
        3 * doFactorialOfNumber(2)
        2 * doFactorialOfNumber(1) (base case: returns 1)
*         5 * 4 * 3 * 2 * 1 = 120
  * */

    private static int doFactorialOfNumber(int item) {
        if (item <= 1) {
            return 1;
        } else {
            return item * doFactorialOfNumber(item - 1);
        }
    }

}
