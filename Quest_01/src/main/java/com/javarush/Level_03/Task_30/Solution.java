package com.javarush.Level_03.Task_30;

import java.util.Scanner;

/*
Работать или не работать - вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt(); // 5
        if (age < 20 || age > 60) {
            System.out.println("можно не работать");
        }
    }
}