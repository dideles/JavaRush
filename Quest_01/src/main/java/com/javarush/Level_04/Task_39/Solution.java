package com.javarush.Level_04.Task_39;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String text = " loves me.";
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int i = 0;
        while (i<10){
            System.out.println(name + text);
            i++;
        }

    }
}