package src.com.javarush.quest01.level01.task01;

// Использование метод форматирования String.format() для создания строки

public class Solution15 {
    public static void main(String[] args) {
        // String message = String.format("%s%s%s", "Амиго", " очень ", "умный");
        String message = String.format("%s%s%s%s%s", "Амиго", " ", "очень", " ", "умный");
        System.out.println(message);
    }
}