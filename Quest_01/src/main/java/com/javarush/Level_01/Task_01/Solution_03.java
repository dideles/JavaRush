package com.javarush.Level_01.Task_01;

/**
 * Конкатенации строк для создания нужного текста
 */
public class Solution_03 {
    public static void main(String[] args) {
        String part1 = "Амиго";
        String part2 = " ";
        String part3 = "очень";
        String part4 = "умный";

        String message = part1 + part2 + part3 + part2 + part4;
        System.out.println(message);
        // System.out.println(part1 + part2 + part3 + part2 + part4);

        // System.out.println(part1.concat(part2).concat(part3).concat(part2).concat(part4));
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