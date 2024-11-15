package com.javarush.Level_01.Task_01;

// Использование StringBuilder для создания изменяемых строк

public class Solution07 {
    public static void main(String[] args) {
        /*
        StringBuilder sb = new StringBuilder();
        sb.append("Амиго").append(" ").append("очень").append(" ").append("умный");
        System.out.println(sb); // Вызывает sb.toString() неявно
        // Warning:(7, 23) 'StringBuilder sb' can be replaced with 'String'
        */

        System.out.println("Амиго" + " " + "очень" + " " + "умный"); // Вызывает sb.toString() неявно
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