package com.javarush.Level_07.Task_85;

public class Solution {
    public static void main(String[] args) {
    }

    public static long cube(long a){
        return a*a*a;
    }

    // напишите тут ваш код

    public static long ninthDegree(long a){
        return cube(cube(a)); // ретурн куб в кубе (17)
        // Запись cube (cube(1)) эквивалентна 1^9. (28)
    }
}
