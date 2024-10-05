package com.javarush.Level_03.Task_22;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        System.out.println(numberA > numberB ? numberA : numberB); // Warning:(10, 28) Can be replaced with 'Math.max()' call
        // System.out.println(Math.max(numberA, numberB));
    }
}