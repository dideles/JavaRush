package com.javarush.Level_01.Task_02;

import java.util.Scanner;

/**
 * Использование класса Scanner для ввода и вывода
 */
public class Solution_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "Я думаю, быть программистом круто";
        System.out.println(text);
        scanner.close();
    }
}