import java.util.Random;
import java.util.Scanner;

public class C13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Введите размерность матрицы n: ");
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        // Заполнение матрицы случайными числами
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rand.nextInt(3) - 1; // значения от -1 до 1
            }
        }
        // Вывод исходной матрицы
        System.out.println("Исходная матрица:");
        printMatrix(a);

        // Преобразование строк
        for (int i = 0; i < n; i++) {
            int[] row = a[i];
            int nonZeroIndex = 0;

            for (int j = 0; j < n; j++) {
                if (row[j] != 0) {
                    row[nonZeroIndex++] = row[j];
                }
            }
            // Заполнение нулями
            while (nonZeroIndex < n) {
                row[nonZeroIndex++] = 0;
            }
        }
        // Вывод измененной матрицы
        System.out.println("Матрица после перемещения нулей:");
        printMatrix(a);
        System.out.println("Разработчик: Юматова Алена Б762-2");
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
