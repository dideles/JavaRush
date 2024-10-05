package src.com.javarush.quest01.level02.task16;

public class Solution {
    public static void main(String[] args) {
        // объявляем переменную emptiness типа String и присваиваем ей значение
        String emptiness = "пустота";

        // объявляем переменную fullness типа String и присваиваем ей результат
        // соединения (конкатенации) строки emptiness с пробелами " "
        String fullness = emptiness + " " + emptiness + " " + emptiness;

        // выводим на экран значение переменной fullness
        System.out.println(fullness);
    }
}

