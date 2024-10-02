package Quest_1.src.com.javarush.tasks.Level_01.Task_07;

public class Solution_01 {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        //y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}
