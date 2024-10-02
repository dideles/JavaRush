package Quest_1.src.com.javarush.tasks.Level_01.Task_01;

// Конкатенации строк для создания нужного текста

public class Solution_03 {
    public static void main(String[] args) {
        String part1 = "Амиго";
        String part2 = " ";
        String part3 = "очень";
        String part4 = "умный";

        String message = part1 + part2 + part3 + part2 + part4;
        System.out.println(message);
        // System.out.println(part1 + part2 + part3 + part2 + part4);

        // System.out.println(part1.concat(part2).concat(part3).concat(part2).concat(part4));
    }
}
