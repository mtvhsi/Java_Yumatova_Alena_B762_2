import java.util.Scanner;
public class B6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        System.out.print("Введите числа: ");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();

            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    // Проверка на простое число
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
