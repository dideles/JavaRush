package Quest_1.src.com.javarush.tasks.Level_01.Task_01;

// Использование StringBuilder для создания изменяемых строк

public class Solution_06 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Амиго").append(" ").append("очень").append(" ").append("умный");
        System.out.println(sb); // Вызывает sb.toString() неявно
    }
}