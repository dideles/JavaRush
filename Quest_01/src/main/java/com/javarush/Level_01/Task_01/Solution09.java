package com.javarush.Level_01.Task_01;

/**
 * С использованием массива символов
 */
public class Solution09 {
    public static void main(String[] args) {
        char[] characters = {'А', 'м', 'и', 'г', 'о', ' ', 'о', 'ч', 'е', 'н', 'ь', ' ', 'у', 'м', 'н', 'ы', 'й'};
        // System.out.println(chars); // передается сам массив символов message
        System.out.println(new String(characters)); // конструктор String(char[]), который создает строку из массива символов
    }
}