package com.javarush.Level_07.Task_83;

public class Solution {

    public static void main(String[] args) {

    }

    public static void signIn(String username){
        if (username.equals("user")){
            return;
        }
        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }
}
