package com.javarush.Level_01.Task_01;

public class Solution_13 {
    public static void main(String[] args) {

        String[] words = {"Амиго", "очень", "умный"};

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]); // выводим текущее слово без пробела // Амигооченьумный

            if (i != words.length - 1) { // добавляем пробел между словами, кроме последнего
                System.out.print(" ");
            }
        }

    }
}