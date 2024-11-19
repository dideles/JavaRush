package com.javarush.Level_01.Task_02;

/**
 * Использование буфера StringBuffer
 */
/*
        Основное различие между StringBuilder и StringBuffer заключается в том, что
        StringBuilder не синхронизирован, а StringBuffer синхронизован.

        StringBuffer:
            обеспечивает синхронизацию, что делает его безопасным для использования в многопоточных средах.
                Это полезно, если есть несколько потоков, которые одновременно пытаются изменить содержимое буфера.
                    Из-за синхронизации StringBuffer работает медленнее, чем StringBuilder, потому что каждый вызов метода синхронизируется.
         StringBuilder использовать в ситуациях, когда производительность критична и нет необходимости в многопоточности.

         StringBuilder:
            Отсутствие синхронизации:
                StringBuilder не предоставляет синхронизацию.
                    Это делает его небезопасным для использования в многопоточной среде,
                        но зато он быстрее, чем StringBuffer, потому что нет накладных расходов на синхронизацию.
             StringBuilder обычно быстрее, так как отсутствует необходимость в синхронизации.
          StringBuffer использовать, если программа работает в многопоточном режиме
            и требуется защита от одновременного изменения строки несколькими потоками.
          Синхронизация гарантирует, что операции над строковым буфером будут выполнены безопасно.
*/
public class Solution_11 {
    public static void main(String[] args) {

        // StringBuffer sb = new StringBuffer();

        StringBuffer sb;
        sb = new StringBuffer();

        // var sb = new StringBuffer();

        sb.append("Я думаю, быть программистом круто"); //
        System.out.println(sb.toString());
    }
}