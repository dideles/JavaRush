package com.javarush.Level_01.Task_01;

// Представление строки в виде массива символов и затем собрать строку, используя StringBuilder

public class Solution07 {
    public static void main(String[] args) {
        char[] message = {'А', 'м', 'и', 'г', 'о', ' ', 'о', 'ч', 'е', 'н', 'ь', ' ', 'у', 'м', 'н', 'ы', 'й'};
        StringBuilder sb = new StringBuilder();
        for (char c : message) {
            sb.append(c);
        }
        // System.out.println(sb.toString());
        System.out.println(sb); // Вызывает sb.toString() неявно
    }
}