package com.javarush.Level_01.Task_01;

/**
 * Использование массивов строк.
 */
public class Solution_15 {
    public static void main(String[] args) {
        String[] words = {"Амиго", "очень", "умный"};
        System.out.println(String.join(" ", words));
        // Первый аргумент метода — это разделитель, который будет использоваться между элементами массива.
    }
}