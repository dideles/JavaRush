package com.javarush.Level_01.Task_02;

// Использование метода write из класса PrintStream

public class Solution_14 {
    public static void main(String[] args) throws Exception {
        byte[] bytes = "Я думаю, быть программистом круто".getBytes();
        System.out.write(bytes);
    }
}