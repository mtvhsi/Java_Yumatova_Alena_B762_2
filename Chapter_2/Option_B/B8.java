import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /** Ввод числа, основания из и в которую переводим */
        System.out.println("Введите число:");
        String number = scanner.nextLine();
        System.out.println("Введите основание числа:");
        int fromBase = scanner.nextInt();
        System.out.println("Введите основание перевода:");
        int toBase = scanner.nextInt();
        /** Перевод числа в десятичную систему */
        int decimal = Integer.parseInt(number, fromBase);
        /** Перевод из десятичной системы в целевую */
        StringBuilder result = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % toBase;
            if (remainder < 10) {
                result.append(remainder);
            } else {
                result.append((char) ('A' + remainder - 10));
            }
            decimal /= toBase;
        }
        /** Вывод результата */
        System.out.printf("Число %s в системе счисления с основанием %d: %s%n", number, toBase, result.reverse().toString());
        System.out.println("Разработчик: Юматова Алена Б762-2");

        scanner.close();
    }
}
