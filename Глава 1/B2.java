
import java.util.Scanner;
public class B2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        System.out.println("Наименьшее число: " + min);
        System.out.println("Наибольшее число: " + max);

        scanner.close();
    }
}
