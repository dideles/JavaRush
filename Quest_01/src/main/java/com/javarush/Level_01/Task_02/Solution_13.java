package com.javarush.Level_01.Task_02;

/**
 * Использование массива символов
 */
public class Solution_13 {
    public static void main(String[] args) {
        char[] chars = {
                'Я', ' ',
                'д', 'у', 'м', 'а', 'ю', ',', ' ',
                'б', 'ы', 'т', 'ь', ' ',
                'п', 'р', 'о', 'г', 'р', 'а', 'м', 'м', 'и', 'с', 'т', 'о', 'м', ' ',
                'к', 'р', 'у', 'т', 'о'};
        for (char c : chars) {
            System.out.print(c);
        }
    }
}