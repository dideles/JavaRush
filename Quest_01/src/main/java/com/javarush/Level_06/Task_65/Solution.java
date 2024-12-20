package com.javarush.Level_06.Task_65;

import java.util.Scanner;

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (currentString == null) {
                    break;
                }
                if (currentString.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }

        /*for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }*/
        // Warning:(28, 9) 'for' loop can be replaced with enhanced 'for'

        for (String str : strings) {
            if (str != null) {
                System.out.print(str + ", ");
            }
        }
    }
}

