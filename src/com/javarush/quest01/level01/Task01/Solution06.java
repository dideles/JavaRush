package src.com.javarush.quest01.level01.Task01;

// Использование StringBuilder для создания изменяемых строк

public class Solution06 {
    public static void main(String[] args) {
        /*
        StringBuilder sb = new StringBuilder();
        sb.append("Амиго").append(" ").append("очень").append(" ").append("умный");
        System.out.println(sb); // Вызывает sb.toString() неявно
        // Warning:(7, 23) 'StringBuilder sb' can be replaced with 'String'
        */

        System.out.println("Амиго" + " " + "очень" + " " + "умный"); // Вызывает sb.toString() неявно
    }
}