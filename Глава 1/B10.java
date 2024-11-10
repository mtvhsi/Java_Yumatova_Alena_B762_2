import java.util.Scanner;
public class B10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        System.out.println("Введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (isPalindrome(number)) {
                System.out.println(number + " - палиндром");
            }
        }
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = -number;
        }
        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
}
