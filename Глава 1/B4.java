import java.util.Scanner;
public class B4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        System.out.print("Введите " + n + " целых чисел: ");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if (n % 5 == 0 || num % 7 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}


