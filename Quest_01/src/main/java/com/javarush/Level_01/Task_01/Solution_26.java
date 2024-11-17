package com.javarush.Level_01.Task_01;

import java.util.stream.Stream;

/**
 * Лямбда-выражение (Java 8+)
 * Импортирование библиотеки позволяет использовать API потоков, который был введен в Java 8.
 * Он предоставляет мощные инструменты для обработки коллекций и массивов.
 */
public class Solution_26 {
    public static void main(String[] args) {
        String message = Stream.of("Амиго", " очень ", "умный") // Создание потока из заданных элементов c помощью метода Stream.of()
                .reduce("", String::concat); // Метод reduce применяется для агрегирования элементов потока в одно значение
        System.out.println(message);
    }
}
