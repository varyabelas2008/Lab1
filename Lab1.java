import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        // Считывание трёх целых чисел a, b и c из консоли
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();

        // Сначала проверяем наличие нулей — это приоритетное условие
        if (a == 0 || b == 0 || c == 0) {
            out.println("Есть нулевые");
        }
        // Все числа строго больше нуля
        else if (a > 0 && b > 0 && c > 0) {
            out.println("Все числа положительные");
        }
        // Все числа строго меньше нуля
        else if (a < 0 && b < 0 && c < 0) {
            out.println("Все числа отрицательные");
        }
        // Нулей нет, но знаки разные
        else {
            out.println("Все числа положительные или отрицательные");
        }
    }
}
