package com.javarush.Level_01.Task_07;

public class Solution {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        // y = x * y; // y = 2 * 12; y = 24;
        y = x + y; // y = 2 + 12; y = 14

        // Вариант 1: x = 2; y = 24;
        // x = y - x; // x = 24 - 2; x = 12;
        // y = y - x; // y = 24 - 12; y = 12;

        // Вариант 2: x = 2; y = 14;
        x = y - x; // x = 14 - 2; x = 12;
        y = y - x; // y = 14 - 12; y = 2;

        System.out.println(x); // 12
        System.out.println(y); // 2
    }
}
