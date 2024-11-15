package com.javarush.Level_01.Task_01;

/**
 * Использование метода concat.
 * Этот метод добавляет указанную строку в конец текущей строки.
 */
public class Solution04 {
    public static void main(String[] args) {

        String message = "Амиго".concat(" ").concat("очень").concat(" ").concat("умный");
        System.out.println(message);

        // System.out.println("Амиго".concat(" очень ").concat("умный"));

        /*String part1 = "Амиго ";
        String part2 = "очень ";
        String part3 = "умный";
        System.out.println(part1.concat(part2).concat(part3));*/
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