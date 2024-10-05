package src.com.javarush.quest01.level02.task21;

public class Solution {

    public static void main(String[] args) {
        // объявляем переменную caps типа String и присваиваем ей значение
        String caps = "if I type in caps ";
        // объявляем переменную usa типа String и присваиваем ей значение
        String usa = "сша";

        // выводим на экран строку из переменной usa в верхнем регистре,
        // преобразованную с помощью метода toUpperCase
        System.out.println(usa.toUpperCase());
        // выводим на экран строку "Винни Пух" в верхнем регистре, полученное
        // с помощью метода toUpperCase
        System.out.println("Винни Пух".toUpperCase());
        // выводим на экран строку в верхнем регистре, которая образована
        // слиянием строки из переменной caps и "they know I mean business"
        System.out.println((caps + "they know I mean business").toUpperCase());
    }
}
