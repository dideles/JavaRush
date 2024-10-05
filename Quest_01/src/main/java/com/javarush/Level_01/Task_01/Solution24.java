package com.javarush.Level_01.Task_01;

import java.util.stream.Stream;

// Использование Streams (Java 8 и выше):

public class Solution24 {
    public static void main(String[] args) {
        String message = Stream.of("Амиго", "очень", "умный")// Создание потока строк
                .reduce((a, b) -> a + " " + b) // Сборка строк с помощью reduce
                .orElse(""); // Обработка случая, если поток пуст
        System.out.println(message);
    }
}