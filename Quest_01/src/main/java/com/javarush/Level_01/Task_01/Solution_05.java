package com.javarush.Level_01.Task_01;

/**
 * Использование StringBuilder для создания изменяемых строк
 */
public class Solution_05 {
    public static void main(String[] args) {

        // StringBuilder message = new StringBuilder();

        /*
         * Разделить процесс объявления переменной и её инициализация.
         * Например, если нужно сначала выполнить какие-то другие операции до того, как создать объект.
         */
        StringBuilder message;
        message = new StringBuilder();

        message.append("Амиго");
        message.append(" ").append("очень")
                .append(" ")
                .append("сильно")
                .append("умный");
        // message.append("Амиго").append(" ").append("очень").append(" ").append("умный");

        // Удалить слово "сильно"
        int start = message.indexOf("сильно");
        int end = start + "сильно".length();
        message.delete(start, end);

        // System.out.println(message.toString());
        System.out.println(message); // Вызывает message.toString() неявно
    }
}

/*
Оператор +:
    Для простого добавления одной строки к другой.

Метод String.concat():
    Этот метод добавляет указанную строку в конец текущей строки.
    Простота использования для добавления одной строки к другой.
    Производительность сопоставима с конкатенацией.
    НО менее гибкий, чем join, поскольку работает только с добавлением строк друг за другом.

Метод String.join():
    Для объединения нескольких строк с разделителем.
    Удобен для объединения множества строк с одинаковым разделителем.

Метод StringBuilder.append():
    Для высокой производительности при частых операциях конкатенации.
 */