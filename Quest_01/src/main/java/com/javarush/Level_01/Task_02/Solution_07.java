package com.javarush.Level_01.Task_02;

import java.util.Formatter;

/**
 * Использование класса Formatter
 * может быть полезен, если требуется больше возможностей для форматирования,
 * например, поддержка локализации или сложных форматов чисел и дат.
 */
public class Solution_07 {
    public static void main(String[] args) {

        /// создается экземпляр класса Formatter
        Formatter formatter = new Formatter();

        /// вызывается метод format, который форматирует строку аналогично использованию printf.
        formatter.format("%s%n", "Я думаю, быть программистом круто");
        System.out.print(formatter);
    }
}