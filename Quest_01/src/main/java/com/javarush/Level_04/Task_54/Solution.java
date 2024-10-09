package com.javarush.Level_04.Task_54;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speedInMetersPerSecond = scanner.nextInt();
        int speedInKilometersPerHour = (int) Math.round(speedInMetersPerSecond * 3.6);
        System.out.println(speedInKilometersPerHour);
    }
}