import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Введите размерность матрицы n: ");
        int n = scanner.nextInt();
        int[][] a = new int[n][n];

        // Заполнение матрицы случайными числами
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rand.nextInt(2 * n + 1) - n; // значения от -n до n
            }
        }
        // Вывод исходной матрицы
        System.out.println("Исходная матрица:");
        printMatrix(a);

        // Сортировка строк по сумме
        Arrays.sort(a, (row1, row2) -> Integer.compare(sum(row1), sum(row2)));

        // Вывод отсортированной матрицы
        System.out.println("Матрица после сортировки строк по сумме:");
        printMatrix(a);
        System.out.println("Разработчик: Юматова Алена Б762-2");
    }

    private static int sum(int[] row) {
        int sum = 0;
        for (int value : row) {
            sum += value;
        }
        return sum;
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.printf("%3d ", elem);
            }
            System.out.println();
        }
    }
}
