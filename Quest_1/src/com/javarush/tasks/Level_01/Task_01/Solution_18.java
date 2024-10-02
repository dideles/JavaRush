package Quest_1.src.com.javarush.tasks.Level_01.Task_01;

// Цикл для вывода символов

public class Solution_18 {
    public static void main(String[] args) {
        String message = "Амиго очень умный";
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
        }
        System.out.println();
    }
}