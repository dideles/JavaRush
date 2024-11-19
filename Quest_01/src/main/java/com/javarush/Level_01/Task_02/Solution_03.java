package com.javarush.Level_01.Task_02;

import java.io.PrintStream;

/**
 * Использование PrintStream для записи данных в поток вывода
 * Обычно он используется для работы с файлами, сетевыми соединениями или другими источниками данных, где требуется запись информации в определённый поток.
 */
public class Solution_03 {
    public static void main(String[] args) {
        PrintStream out = System.out;
        out.println("Я думаю, быть программистом круто");
    }
}