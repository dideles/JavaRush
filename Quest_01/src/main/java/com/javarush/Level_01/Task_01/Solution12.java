package com.javarush.Level_01.Task_01;

/**
 * Вывод элементов массива строк в консоль через цикл с пробелом.
 * НО нужно учитывать, что после последнего слова также будет добавлен лишний пробел.
 * См. Solution13
 */
public class Solution12 {
    public static void main(String[] args) {
        String[] words = {"Амиго", "очень", "умный"};
        for (String word : words) {
            System.out.print(word + " ");
            // System.out.print((word + " ").toString().trim()); // может быть излишне ресурсоемким для длинных строк
        }

    }
}

