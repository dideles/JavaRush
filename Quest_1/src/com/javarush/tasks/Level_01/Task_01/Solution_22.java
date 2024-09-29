package Quest_1.Level_1.Task_1;

// Использование интерфейс Runnable и лямбда-выражение (Java 8+)

public class Solution_22 {
    public static void main(String[] args) {
        Runnable message = () -> System.out.println("Амиго очень умный");
        message.run();
    }
}