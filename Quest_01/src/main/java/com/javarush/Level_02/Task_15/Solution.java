package com.javarush.Level_02.Task_15;

public class Solution {
    public static void main(String[] args) {
        // объявляем переменную s1 типа String и присваиваем ей значение
        String s1 = "Do";
        // объявляем переменную s2 типа String и присваиваем ей значение
        String s2 = "It";
        // объявляем переменную s3 типа String и присваиваем ей значение
        String s3 = "Just";

        // объявляем переменную tagline типа String и присваиваем ей результат
        // соединения (конкатенации) строк s3, s1 и s2
        String tagline = s3 + s1 + s2;

        // выводим на экран значение переменной tagline
        System.out.println(tagline);
    }
}