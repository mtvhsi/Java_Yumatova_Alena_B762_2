import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /** Ввод чисел из консоли */
        System.out.println("Введите числа, разделяя пробелом: ");
        String[] numbers = scanner.nextLine().split(" ");
        String shortestN = numbers[0];
        String longestN = numbers[0];
        /** Поиск самого короткого и самого длинного числа */
        for (String number : numbers) {
            if (number.length() < shortestN.length()) {
                shortestN = number;
            }
            if (number.length() > longestN.length()) {
                longestN = number;
            }
        }
        /** Вывод результатов */
        System.out.printf("Самое короткое число: %s, длина: %d%n", shortestN, shortestN.length());
        System.out.printf("Самое длинное число: %s, длина: %d%n", longestN, longestN.length());
        String developerName = "Юматова Алена Б762-2";
        System.out.println("Разработчик: " + developerName);
        scanner.close();
    }
}
