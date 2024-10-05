package com.javarush.Level_03.Task_28;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Ставить равенство трёх в начало
        if (a == b && b == c && a == c) // Condition 'a == b' covered by subsequent conditions
            System.out.println(a + " " + b + " " + c);
        else if (a == b)
            System.out.println(a + " " + b);
        else if (b == c)
            System.out.println(b + " " + c);
        else if (a == c)
            System.out.println(a + " " + c);

        /*
        boolean abc = a==b && b==c && a==c;
        boolean ab = a==b;
        boolean bc = b==c;
        boolean ac = a==c;

        if(abc)
            System.out.println(a+" "+b+" "+c);
        else if(ab)
            System.out.println(a + " " + b);
        else if(bc)
            System.out.println(b+" "+c);
        else if(ac)
            System.out.println(a+" "+c);
        */

        /*
        Правильное решение JavaRush:

        if (number1 == number2) {
            if (number1 == number3) {
                System.out.println(number1 + " " + number2 + " " + number3);
            } else {
                System.out.println(number1 + " " + number2);
            }
        } else if (number1 == number3) {
            System.out.println(number1 + " " + number3);
        } else if (number2 == number3) {
            System.out.println(number2 + " " + number3);
        }
         */
    }
}