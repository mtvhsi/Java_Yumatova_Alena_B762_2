import java.util.Random;
import java.util.Scanner;

public class C16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Введите размерность матрицы n: ");
        int n = scanner.nextInt();
        int[][] a = new int[n][n];

        // Заполнение матрицы случайными числами
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rand.nextInt(10) - 5; // значения от -5 до 4
            }
        }

        // Вывод исходной матрицы
        System.out.println("Исходная матрица:");
        printMatrix(a);

        // Подсчет локальных минимумов
        int localMinimaCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isLocalMinimum(a, i, j)) {
                    localMinimaCount++;
                }
            }
        }
        System.out.println("Количество локальных минимумов: " + localMinimaCount);
        System.out.println("Разработчик: Юматова Алена Б762-2");
    }
    private static boolean isLocalMinimum(int[][] matrix, int x, int y) {
        int value = matrix[x][y];
        // Проверка соседей
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i >= 0 && j >= 0 && i < matrix.length && j < matrix[0].length) {
                    if (!(i == x && j == y) && matrix[i][j] <= value) {
                        return false;
                    }
                }
            }
        }
        return true;
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
