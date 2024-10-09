package com.javarush.Level_04.Task_53;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        double result = firstNumber * 1. / secondNumber;
        System.out.println(result);
    }
}

