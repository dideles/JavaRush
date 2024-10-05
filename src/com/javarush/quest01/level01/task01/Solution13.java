package src.com.javarush.quest01.level01.task01;

// Использование массивов строк

public class Solution13 {
    public static void main(String[] args) {
        String[] words = {"Амиго", "очень", "умный"};
        System.out.println(String.join(" ", words));
        // Первый аргумент метода — это разделитель, который будет использоваться между элементами массива.
    }
}