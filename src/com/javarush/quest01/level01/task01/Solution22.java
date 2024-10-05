package src.com.javarush.quest01.level01.task01;

// Использование интерфейс Runnable и лямбда-выражение (Java 8+)

public class Solution22 {
    public static void main(String[] args) {
        Runnable message = () -> System.out.println("Амиго очень умный");
        message.run();
    }
}