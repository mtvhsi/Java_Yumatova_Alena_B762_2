import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /** Ввод чисел из консоли */
        System.out.println("Введите числа, разделяя пробелом: ");
        String[] n = scanner.nextLine().split(" ");
        /** Сортировка чисел по длине */
        Arrays.sort(n, Comparator.comparingInt(String::length));
        /** Вывод отсортированных чисел */
        System.out.println("Числа в порядке возрастания значений их длины:");
        for (String num : n) {
            System.out.println(num);
        }
        String developerName = "Юматова Алена Б762-2";
        System.out.println("Разработчик: " + developerName);

        scanner.close();
    }
}
