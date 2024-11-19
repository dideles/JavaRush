package com.javarush.Level_01.Task_02;

/**
 * Использование многоточия для создания строки
 * Метод String.join используется для объединения массива строк или коллекции строк с указанным разделителем.
 * В этом коде строки объединены без разделителя, что делает использование join излишним.
 * Проще воспользоваться оператором конкатенации +.
 */
public class Solution_12 {
    public static void main(String[] args) {
        String statement = String.join("", "Я ", "думаю, ", "быть ", "программистом ", "круто");
        System.out.println(statement);
    }
}