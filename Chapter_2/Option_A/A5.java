import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /** Ввод чисел из консоли */
        System.out.println("Введите числа, разделяя пробелом: ");
        String[] num = scanner.nextLine().split(" ");
        int chetnie = 0;
        int equal = 0;
        /** Подсчет чисел с четными цифрами */
        for (String number : num) {
            if (number.chars().allMatch(c -> (c - '0') % 2 == 0)) {
                chetnie++;
                int evenC = (int) number.chars().filter(c -> (c - '0') % 2 == 0).count();
                int oddCount = number.length() - evenC;
                if (evenC == oddCount) {
                    equal++;
                }
            }
        }
        /** Вывод результатов */
        System.out.printf("Количество чисел, содержащих только четные цифры: %d%n", chetnie);
        System.out.printf("Количество чисел с равным числом четных и нечетных цифр: %d%n", equal);

        String developerName = "Юматова Алена Б762-2";
        System.out.println("Разработчик: " + developerName);

        scanner.close();
    }
}
