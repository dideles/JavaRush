package com.javarush.Level_01.Task_07;

public class Solution {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        //y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}
