package com.dd.leet.code.sept;

import java.util.HashSet;
import java.util.Scanner;

public class CommandChar {
    public static void main(String[] args) {
        System.out.println("Enter the String to ONE :");
        Scanner scanner = new Scanner(System.in);
        String enterString = scanner.nextLine();
        System.out.println("Enter the String to TWO :");
        String enterString1 = scanner.nextLine();
        getCommonCharacters(enterString, enterString1);
    }

    private static void getCommonCharacters(String enterString, String enterString1) {
        HashSet<Character> withOutDup = new HashSet<>();

        for (char each : enterString.toCharArray()) {
            withOutDup.add(each);
        }

        for (char each : enterString1.toCharArray()) {
            if (withOutDup.contains(each)) {
                withOutDup.remove(each);
                System.out.println(" Common character  " + each);
            }
        }
    }
}
