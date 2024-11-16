package com.javarush.Level_01.Task_01;

/**
 * Создание строки из массива строк с использованием цикла.
 */
public class Solution_14 {
    public static void main(String[] args) {

        String[] words = {"Амиго", "очень", "умный"};

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(word).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}

