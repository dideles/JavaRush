package com.javarush.Level_01.Task_01;

import java.util.Arrays;
import java.util.List;
// import java.util.stream.Collectors;

/**
 * Использование List и метода stream
 */
public class Solution_28 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Амиго", "очень", "умный");

        /*
        Метод String.join принимает два аргумента:
        строку-разделитель (в данном случае пробел " ") и коллекцию строк (words).
         */
        // String result = String.join(" ", words);

        /*
        Это метод для объединения элементов коллекции, используя Java Stream API.
        Обеспечивает более высокую гибкость и мощность при обработке данных.
        Полезно для сложной обработки данных перед объединением, например, фильтрация или преобразование элементов.
         */
        // String result = words.stream().collect(Collectors.joining(" ")); // import
        String result = String.join(" ", words);

        System.out.println(result);
    }
}