package com.javarush.Level_03.Task_24;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in); // Создать объект1 = данные из ввода с консоли
        int temperature = scanner.nextInt(); // Создать переменную = данные берутся из объекта1
        if (temperature < 0) { // Далее условие: если меньше, то написать одну переменную, в противном случае - другую
            System.out.println(cold);
        } else {
            System.out.println(warm);
        }
    }
}
