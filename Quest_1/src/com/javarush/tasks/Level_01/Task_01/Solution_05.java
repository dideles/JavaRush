package Quest_1.src.com.javarush.tasks.Level_01.Task_01;

// Использование StringBuilder для создания изменяемых строк

public class Solution_05 {
    public static void main(String[] args) {
        StringBuilder message = new StringBuilder();
        message.append("Амиго");
        message.append(" ").append("очень")
                .append(" ")
                .append("сильно")
                .append("умный");
        // message.append("Амиго").append(" ").append("очень").append(" ").append("умный");

        // Удаляем слово "сильно"
        int start = message.indexOf("сильно");
        int end = start + "сильно".length();
        message.delete(start, end);

        // System.out.println(message.toString());
        System.out.println(message);
    }
}