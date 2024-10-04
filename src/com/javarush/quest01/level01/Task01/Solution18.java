package src.com.javarush.quest01.level01.Task01;

// Цикл для вывода символов

public class Solution18 {
    public static void main(String[] args) {
        String message = "Амиго очень умный";
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
        }
        System.out.println();
    }
}