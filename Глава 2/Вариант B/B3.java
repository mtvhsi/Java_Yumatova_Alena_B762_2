import java.util.Scanner;
public class B3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /** Ввод значений */
        System.out.println("Введите n:");
        int n = scanner.nextInt(); // Начало интервала
        System.out.println("Введите m:");
        int m = scanner.nextInt(); // Конец интервала
        System.out.println("Введите k:");
        int k = scanner.nextInt(); // Проверяемое значение
        /** Определяем принадлежность k интервалам */
        System.out.println("k принадлежит:");
        System.out.println("- (n, m]: " + (k > n && k <= m));
        System.out.println("- [n, m): " + (k >= n && k < m));
        System.out.println("- (n, m): " + (k > n && k < m));
        System.out.println("- [n, m]: " + (k >= n && k <= m));
        System.out.println("Разработчик: Юматова Алена Б762-2");
        scanner.close();
    }
}
