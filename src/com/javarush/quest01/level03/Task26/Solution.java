package src.com.javarush.quest01.level03.Task26;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18)
        { //
            if (age >= 6)
                System.out.println("нужно ходить в школу");
        } //
            /*
                Если не поставить фигурные скобки в нужном месте,
                    то else будет относится к ближайшему (второму) if,
                        а нам надо, чтобы он относился к первому if.
             */
        else
            System.out.println("пора в институт");
    }
}