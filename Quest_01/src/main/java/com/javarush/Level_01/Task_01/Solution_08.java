package com.javarush.Level_01.Task_01;

/**
 * Представление строки в виде массива символов и затем собрать строку, используя StringBuilder.
 */
public class Solution_08 {
    public static void main(String[] args) {
        char[] message = {
                'А', 'м', 'и', 'г', 'о',
                ' ',
                'о', 'ч', 'е', 'н', 'ь',
                ' ',
                'у', 'м', 'н', 'ы', 'й'};
        /*
        Создается объект StringBuilder без указания начальной емкости.
        По умолчанию начальная емкость составляет 16 символов.
        Если количество символов в массиве превышает эту емкость,
        то StringBuilder автоматически увеличивает свою внутреннюю буферную область,
        что может привести к дополнительным затратам ресурсов на перераспределение памяти.
         */
        // StringBuilder sb = new StringBuilder();
        /*
        В этом фрагменте при создании объекта StringBuilder указывается начальная емкость, равная длине массива message.
        Это предотвращает необходимость автоматического увеличения внутренней буферной области,
        что делает выполнение кода более эффективным, особенно при работе с большими объемами данных.
         */
        // Создание StringBuilder с указанием длины массива для оптимизации
        StringBuilder sb = new StringBuilder(message.length); //

        for (char c : message) {
            sb.append(c);
        }

        // System.out.println(sb.toString());
        System.out.println(sb); // Вызывает sb.toString() неявно
        /*
        Т.е., при передаче объекта sb в метод println(), автоматически вызывается метод toString()
        для преобразования содержимого StringBuilder в строку.

        Это связано с тем, что класс StringBuilder переопределяет метод toString(),
        чтобы вернуть строку, содержащую все символы, добавленные к объекту StringBuilder.

        Таким образом, разницы между этими двумя вариантами нет,
        т.к. оба они приводят к выводу строки, представляющей содержимое StringBuilder.
        Но использование метода toString() может сделать код чуть более явным,
        особенно если вам нужно использовать результат в других операциях, а не просто выводить его на консоль.
         */
    }
}