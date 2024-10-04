package src.com.javarush.quest01.level03.Task27;

import java.util.Scanner;

public class Solution {
    private static boolean isHigh; // Field can be converted to a local variable
    private static boolean isLow; // Field can be converted to a local variable

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble(); // 36,6
        isHigh = bodyTemperature > 37;
        isLow = bodyTemperature < 36;
        if (isHigh) {
            System.out.println("температура тела высокая");
        } else if (isLow) {
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }
    }
}
