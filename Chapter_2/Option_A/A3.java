import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /** Ввод чисел из консоли */
        System.out.println("Введите числа, разделяя пробелом: ");
        String[] num = scanner.nextLine().split(" ");
        /** Вычисляем среднюю длину чисел */
        double sred = 0;
        for (String n : num) {
            sred += n.length();
        }
        sred /= num.length;

        /** Вывод чисел с длиной меньше и больше средней */
        System.out.println("Числа, длина которых меньше средней:");
        for (String n : num) {
            if (n.length() < sred) {
                System.out.printf("%s, длина: %d%n", n, n.length());
            }
        }
        System.out.println("Числа, длина которых больше средней:");
        for (String n : num) {
            if (n.length() > sred) {
                System.out.printf("%s, длина: %d%n", n, n.length());
            }
        }
        /** Вывод информации о разработчике и времени */
        String developerName = "Юматова Алена Б762-2";
        System.out.println("Разработчик: " + developerName);
        scanner.close();
    }
}
