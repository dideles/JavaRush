package com.javarush.Level_03.Task_36;

public class Solution {
    public static String string1 = "Амиго";
    public static String string2 = string1;
    public static String string3 = new String(string1); // 'new String()' is redundant // Избыточно
    // Предупреждение служит напоминанием об эффективности использования объектов строк в Java.
    // String string3 = string1; // Указывает на тот же объект строки // Эффективнее

    public static void main(String[] args) {
        String same = "ссылки на строки одинаковые";
        String different = "ссылки на строки разные";

        //напишите тут ваш код
        if (string1 == string2) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }

        if (string1 == string3) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }

        if (string2 == string3) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }
    }
}
