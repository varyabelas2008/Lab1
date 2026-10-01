import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        // Считывание трех натуральных чисел a, b и c из консоли
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a > 0 && b > 0 && c > 0) {
            // Если все числа больше нуля, то выводим "Все числа положительные"
            System.out.println("Все числа положительные");
        } else if (a < 0 && b < 0 && c < 0) {
            // Если все числа меньше нуля, то выводим "Все числа отрицательные"
            System.out.println("Все отрицательные");
        } else if (a == 0 || b == 0 || c == 0) {
            // Если есть хоть одно число равное 0, то выводим "Есть нулевые"
            System.out.println("Есть нулевые");
        } else {
            // Если числа не подошли ни под один критерий, то выводим "Все числа положительные или отрицательные"
            System.out.println("Все числа положительные или отрицательные");
        }
    }
}