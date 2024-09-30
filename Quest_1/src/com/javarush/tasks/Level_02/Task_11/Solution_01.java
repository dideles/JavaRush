package Quest_1.Level_2.Task_11;

public class Solution {

    public static void main(String[] args) {
        // объявляем переменную number типа int и сразу же в строке объявления
        // присваиваем ей значение 546
        int number = 546;

        // создаем переменную lastDigit типа int, в которую помещаем значение
        // последней цифры числа number
        // (number % 10 дает остаток от деления number на 10, а это и будет
        // последняя цифра числа number)
        int lastDigit = number % 10;

        // выводим на экран значение переменной lastDigit
        System.out.println(lastDigit); // 6
    }
}
