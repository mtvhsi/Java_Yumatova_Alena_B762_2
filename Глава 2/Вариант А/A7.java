import java.util.Scanner;
import java.time.LocalDateTime;

public class A7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /** Ввод чисел из консоли */
        System.out.println("Введите числа, разделяя пробелом: ");
        String[] numbers = scanner.nextLine().split(" ");
        String result = null;

        /** Поиск числа, состоящего только из различных цифр */
        for (String number : numbers) {
            if (number.chars().distinct().count() == number.length()) {
                result = number;
                break; // Найдено первое подходящее число
            }
        }
        /** Вывод результата */
        System.out.printf("Число, состоящее только из различных цифр: %s%n", result);

        String developerName = "Юматова Алена Б762-2";
        System.out.println("Разработчик: " + developerName);

        scanner.close();
    }
}
