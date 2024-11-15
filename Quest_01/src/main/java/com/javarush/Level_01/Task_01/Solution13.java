package com.javarush.Level_01.Task_01;

/**
 * Вывод элементов массива строк с правильным форматированием, избегая лишнего пробела в конце.
 */
public class Solution13 {
    public static void main(String[] args) {
        String[] words = {"Амиго", "очень", "умный"};

        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                System.out.print(" "); // Добавляем пробел перед всеми словами, кроме первого
            }
            System.out.print(words[i]);
        }
    }
}