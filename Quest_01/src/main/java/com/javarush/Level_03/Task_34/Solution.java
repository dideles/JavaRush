package com.javarush.Level_03.Task_34;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstDouble = scanner.nextDouble();
        double secondDouble = scanner.nextDouble();

        if (Math.abs(secondDouble - firstDouble) < 0.000001) {
            System.out.println("числа равны");
        } else {
            System.out.println("числа не равны");
        }
    }
}

