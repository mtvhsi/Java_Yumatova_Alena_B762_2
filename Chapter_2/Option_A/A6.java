import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /** Ввод чисел из консоли */
        System.out.println("Введите числа, разделяя пробелом: ");
        String[] numbers = scanner.nextLine().split(" ");

        String result = null;

        /** Поиск числа с цифрами в порядке возрастания */
        for (String number : numbers) {
            boolean isIncreasing = true;
            for (int i = 0; i < number.length() - 1; i++) {
                if (number.charAt(i) >= number.charAt(i + 1)) {
                    isIncreasing = false;
                    break;
                }
            }
            if (isIncreasing) {
                result = number;
                break; // Найдено первое подходящее число
            }
        }
        /** Вывод результата */
        System.out.printf("Число, цифры в котором идут в порядке возрастания: %s%n", result);
        String developerName = "Юматова Алена Б762-2";
        System.out.println("Разработчик: " + developerName);

        scanner.close();
    }
}
