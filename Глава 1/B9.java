import java.util.Scanner;
public class B9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        System.out.print("Введите " + n + " чисел: ");

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();

            if (isHappy(number)) {
                System.out.println(number + " - Счастливое число");
            }
        }
    }
    public static boolean isHappy(int number) {
        while (number != 1 && number != 4) {
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            number = sum;
        }
        return number == 1;
    }
}
