package src.com.javarush.quest01.level03.task31;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();

        boolean bx = (x > 0);
        boolean by = (y > 0);

        if(bx&&by) { System.out.println(1);} // положительное и положительное

        else if(!bx&&by) { System.out.println(2); } // не положительное и положительное
        else if(!bx&&!by) { System.out.println(3); } // не положительное и не положительное
        else if(bx&&!by) { System.out.println(4); } // положительное и не положительное
    }
}