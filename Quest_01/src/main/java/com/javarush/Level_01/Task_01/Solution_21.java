package com.javarush.Level_01.Task_01;

/**
 * Цикл для вывода символов.
 */
public class Solution_21 {
    public static void main(String[] args) {
        String message = "Амиго очень умный";
        for (int i = 0; i < message.length(); i++) {
            // Внутри цикла вызывается метод message.charAt(i), который возвращает символ на позиции i
            System.out.print(message.charAt(i));
        }
        System.out.println();
    }
}