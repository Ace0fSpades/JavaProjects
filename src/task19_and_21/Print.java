package task19_and_21;

import java.util.Arrays;
import java.util.List;

public class Print {

    void print(String s) {
        if (s == null) {
            throw new NullPointerException("Исключение: строка пустая!");
        }
        System.out.println("Вывод: " + s);
    }

    public static void main(String[] args) {
        Print print = new Print();
        List<String> list= Arrays.asList("первый тест", null, "второй тест");

        for (String s:list) {
            try {
                print.print(s);
            }
            catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("Исключение поймано.");
            }
            finally {
                System.out.println("Выполняется в любом случае");
            }
            System.out.println("-----------------");
        }

    }
}