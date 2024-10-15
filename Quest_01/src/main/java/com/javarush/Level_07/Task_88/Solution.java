package com.javarush.Level_07.Task_88;

public class Solution {

    public static void main(String[] args) {
        int[] array = {15,64,9,51,42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String elementSqrtString = "Корень квадратный для числа ";

        /*for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(element);
            System.out.println(elementSqrtString + element + " равен " + elementSqrt);
        }*/

        for (int element : array) {
            double elementSqrt = Math.sqrt(element);
            System.out.println(elementSqrtString + element + " равен " + elementSqrt);
        }

    }
}