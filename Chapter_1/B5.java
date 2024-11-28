import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (uniqChislo(num)) {
                System.out.println(num + " - это трехзначное число с уникальными цифрами.");
            }
        }
    }
    public static boolean uniqChislo(int num) {
        if (num < 100 || num > 999) {
            return false;
        }

        int h= num / 100;
        int t = (num % 100) / 10;
        int u = num % 10;
        if (h == t|| h == u|| t == u) {
            return false;
        }
        return true;
    }
}
