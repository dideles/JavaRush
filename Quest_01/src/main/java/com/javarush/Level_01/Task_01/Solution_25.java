package com.javarush.Level_01.Task_01;

/**
 * Использование интерфейс Runnable и лямбда-выражение (Java 8+).
 */
public class Solution_25 {
    public static void main(String[] args) {
        Runnable message = () -> System.out.println("Амиго очень умный");
        message.run();
    }
}