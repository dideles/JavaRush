package com.javarush.Level_09.Task_118;

public class Solution {

    public static void main(String[] args) {
        int x = 7;
//        x = x & 25;
        x = x & 5;
//        x = x & 3;
        x = x & 12;
        x = x | 1;
        System.out.println(x);
    }
}
