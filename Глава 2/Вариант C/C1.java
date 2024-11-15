import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C1 {
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

        // Вывод матрицы
        System.out.println("Исходная матрица:");
        printMatrix(a);

        System.out.print("Введите номер столбца k для сортировки (0-" + (n - 1) + "): ");
        int k = scanner.nextInt();

        // Сортировка строк по k-му столбцу
        Arrays.sort(a, (row1, row2) -> Integer.compare(row1[k], row2[k]));

        // Вывод отсортированной матрицы
        System.out.println("Матрица после сортировки по столбцу " + k + ":");
        printMatrix(a);

        System.out.println("Разработчик: Юматова Алена Б762-2");
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
