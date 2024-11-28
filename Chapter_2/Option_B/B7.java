import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /** Ввод числа и основания системы счисления */
        System.out.println("Введите десятичное число:");
        int decimal = scanner.nextInt();
        System.out.println("Введите основание системы счисления (2-36):");
        int base = scanner.nextInt();
        /** Перевод в другую систему счисления */
        StringBuilder result = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % base;
            if (remainder < 10) {
                result.append(remainder);
            } else {
                result.append((char) ('A' + remainder - 10));
            }
            decimal /= base;
        }
        /** Вывод результата */
        System.out.printf("Число в системе счисления с основанием %d: %s%n", base, result.reverse().toString());
        System.out.println("Разработчик: Юматова Алена Б762-2");

        scanner.close();
    }
}
