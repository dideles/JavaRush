package Quest_1.Level_3.Task_25;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        //напишите тут ваш код

        Scanner scanner = new Scanner(System.in); // Создать объект = данные из ввода консоли.
        System.out.println("Введите имя: "); // user friendly как приглашение к вводу с клавиатуры
        String name = scanner.nextLine();
        System.out.println("Введите возраст"); // user friendly как приглашение к вводу с клавиатуры
        int age = scanner.nextInt();

        /*
        Принцип вложенности:
        if(age>=18)
            if(age<=28)
        */
        // !if(17<age<29)
        if(age>=18 && age<=28) // if(age>17 && age<29)
            // ? ((age>=18) && (age<=28))
            // !age<=18 && age<=28
            System.out.println(name + militaryCommissar);
        // Сокращенная форма if без else
    }
}
