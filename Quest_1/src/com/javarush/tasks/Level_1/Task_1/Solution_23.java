package Quest_1.Level_1.Task_1;

// Лямбда-выражение (Java 8+)

/**
 * Импортирование библиотеки позволяет использовать API потоков, который был введен в Java 8.
 * Он предоставляет мощные инструменты для обработки коллекций и массивов.
 */
import java.util.stream.Stream;


public class Solution_23 {
    public static void main(String[] args) {
        String message = Stream.of("Амиго", " очень ", "умный") // Создание потока из заданных элементов c помощью метода Stream.of()
                .reduce("", String::concat); // Метод reduce применяется для агрегирования элементов потока в одно значение
        System.out.println(message);
    }
}
