import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /** Ввод чисел из консоли */
        System.out.println("Введите числа, разделяя пробелом: ");
        String[] n = scanner.nextLine().split(" ");

        String[] palindroms = new String[n.length];
        int palindrom = 0;

        /** Поиск палиндромов */
        for (String number : n) {
            if (new StringBuilder(number).reverse().toString().equals(number)) {
                palindroms[palindrom++] = number;
            }
        }
        /** Вывод результата */
        if (palindrom > 1) {
            System.out.printf("Второе число-палиндром: %s%n", palindroms[1]);
        } else {
            System.out.println("Нет чисел-палиндромов.");
        }
        
        String developerName = "Юматова Алена Б762-2";
        System.out.println("Разработчик: " + developerName);
        scanner.close();
    }
}
