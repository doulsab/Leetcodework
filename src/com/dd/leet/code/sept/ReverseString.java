package com.dd.leet.code.sept;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter the string to reverse :");
        Scanner scanner = new Scanner(System.in);
        String enterString = scanner.nextLine();
        StringBuilder stb = new StringBuilder();
        /**
         * Test case I :
         *  Entered String :
         *  0 1 2 3 4
         *  c o d e r - >(expected redoc).
         *  Itr : i = 4 which is > or = 0 true char index is 'r' stb is "r".
         *  Itr : i = 3 which is > or = 0 true char index is 'e' stb is "re".
         *  Itr : i = 2 which is > or = 0 true char index is 'd' stb is "red".
         *  Itr : i = 1 which is > or = 0 true char index is '0' stb is "redo".
         *  Itr : i = 0 which is > or = 0 true char index is 'c' stb is "redoc".
         *  Itr : i = -1 which is < 0 false loop will terminate.
         */
        for (int i = enterString.length()-1; i >=0; i--) {
            char charIs = enterString.charAt(i);
            stb.append(charIs);
        }
        System.out.println("Reverse of entered string :" + enterString + " is -> " + stb);


    }
}
