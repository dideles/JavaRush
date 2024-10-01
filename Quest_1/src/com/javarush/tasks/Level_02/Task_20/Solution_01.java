package Quest_1.Level_2.Task_20;

public class Solution {

    public static void main(String[] args) {
        // объявляем переменную title типа String и присваиваем ей значение
        String title = "Senior Lead Principal Software Engineer Data Architect";
        // объявляем переменную degree типа String и присваиваем ей значение
        String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
        // объявляем переменную career типа String и присваиваем ей значение
        String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";

        // выводим на экран строку "RESUME" в нижнем регистре, полученное
        // с помощью метода toLowerCase
        System.out.println("RESUME".toLowerCase());
        // выводим на экран строку в нижнем регистре, которая образована
        // слиянием строки "TITLE: " и строки из переменной title
        System.out.println(("TITLE: " + title).toLowerCase());
        // выводим на экран строку в нижнем регистре, которая образована
        // слиянием строки "DEGREE: " и строки из переменной degree
        System.out.println(("DEGREE: " + degree).toLowerCase());
        // выводим на экран строку в нижнем регистре, которая образована
        // слиянием строки "CAREER: " и строки из переменной career
        System.out.println(("CAREER: " + career).toLowerCase());
    }
}
