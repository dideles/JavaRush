package com.javarush.tasks.Level_1.Task_1;

// Использование StringBuilder для создания изменяемых строк

public class Solution_6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Амиго").append(" ").append("очень").append(" ").append("умный");
        System.out.println(sb); // Вызывает sb.toString() неявно
    }
}