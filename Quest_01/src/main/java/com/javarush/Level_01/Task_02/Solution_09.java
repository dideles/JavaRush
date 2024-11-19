package com.javarush.Level_01.Task_02;

/**
 * Использование конструктора строки StringBuilder
 */
public class Solution_09 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Я думаю, быть программистом круто");
        System.out.println(sb.toString());

        // System.out.println(new StringBuilder().append("Я думаю, быть программистом круто").toString());
    }
}