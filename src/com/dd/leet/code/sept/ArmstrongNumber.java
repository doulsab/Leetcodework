package com.dd.leet.code.sept;

import java.util.Scanner;

/**
 * @author DD
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter number to print upto amstrang number :");
        doArmStrongNumber(cs.nextInt());
    }

    private static void doArmStrongNumber(int items) {
        for (int i = 0; i < items; i++) {
            if (checkIsArmStrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
// test case I : 153 

    /*
    itr 1 :
    digit = 153%10 = 3;
    num = 153/10 = 15
    sum = (0+3*3*3)=27
    itr 2 :
    digit = 15%10 = 5
    num = 15/10 = 1
    sum = 27 + 5 * 5 * 5 = 152
    itr 3 :
    digit = 1%10 = 0
    num = 1/10;
    sum = 152+1*1*1 = sum =153
    
    sum == temp i.e 153=153
    
     */
    private static boolean checkIsArmStrongNumber(int num) {
        int temp = num, sum = 0;
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            sum += (digit * digit * digit);
        }
        return sum == temp;
    }
}
