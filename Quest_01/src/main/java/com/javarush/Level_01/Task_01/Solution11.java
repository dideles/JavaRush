package com.javarush.Level_01.Task_01;

/**
 * Использование массивов строк через цикл
 */
public class Solution11 {
    public static void main(String[] args) {
        String[] parts = {
                "Амиго",
                " ",
                "очень",
                " ",
                "умный"};
        for (String part : parts) {
            System.out.print(part);
        }

        // Переход на новую строку
        System.out.println(); // чтобы отделить его от следующего блока кода
    }
}
