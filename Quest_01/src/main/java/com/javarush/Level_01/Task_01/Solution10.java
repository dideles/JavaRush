package com.javarush.Level_01.Task_01;

/**
 * Вывод массива символов в консоль
 */
public class Solution10 {
    public static void main(String[] args) {
        char[] letters = {
                'А', 'м', 'и', 'г', 'о',
                ' ',
                'о', 'ч', 'е', 'н', 'ь',
                ' ',
                'у', 'м', 'н', 'ы', 'й'};

        for (char c : letters) {
            System.out.print(c);
        }

        // Переход на новую строку
        System.out.println(); // чтобы отделить его от следующего блока кода
    }
}