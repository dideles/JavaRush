package Quest_1.src.com.javarush.tasks.Level_03.Task_32;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        System.out.println(numberA > numberB ? numberA : numberB); // Math.max()
    }
}