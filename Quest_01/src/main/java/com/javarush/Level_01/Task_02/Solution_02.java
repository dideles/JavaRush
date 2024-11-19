package com.javarush.Level_01.Task_02;

/**
 * Использование переменной для хранения текста
 */
public class Solution_02 {
    public static void main(String[] args) {

        String message = "Я думаю, быть программистом круто";

        // если строка статична и не изменяется, её можно сделать константой (final), чтобы подчеркнуть неизменность значения:
        // final String MESSAGE = "Я думаю, быть программистом круто";

        System.out.println(message);
    }
}