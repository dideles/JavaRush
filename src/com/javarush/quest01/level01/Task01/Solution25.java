package src.com.javarush.quest01.level01.Task01;

// Использование List и метода stream

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution25 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Амиго", "очень", "умный");
        /*
         * Метод String.join принимает два аргумента:
         * строку-разделитель (в данном случае пробел " ") и коллекцию строк (words).
         */
        // String result = String.join(" ", words);

        /*
         * Это метод для объединения элементов коллекции, используя Java Stream API.
         * Обеспечивает более высокую гибкость и мощность при обработке данных.
         * Полезно для сложной обработки данных перед объединением, например, фильтрация или преобразование элементов.
         */
        String result = words.stream().collect(Collectors.joining(" "));

        System.out.println(result);
    }
}