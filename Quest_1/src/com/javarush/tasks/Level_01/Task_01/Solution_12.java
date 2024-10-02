package Quest_1.src.com.javarush.tasks.Level_01.Task_01;

// Использование цикла для создания строки

public class Solution_12 {
    public static void main(String[] args) {
        String[] words = {"Амиго", "очень", "умный"};
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}

