import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C11 {
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

        // Найти ненулевые строки
        List<Integer> nonZeroRows = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean isZeroRow = true;
            for (int j = 0; j < n; j++) {
                if (a[i][j] != 0) {
                    isZeroRow = false;
                    break;
                }
            }
            if (!isZeroRow) nonZeroRows.add(i);
        }
        // Найти ненулевые столбцы
        List<Integer> nonZeroCols = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            boolean isZeroCol = true;
            for (int i = 0; i < n; i++) {
                if (a[i][j] != 0) {
                    isZeroCol = false;
                    break;
                }
            }
            if (!isZeroCol) nonZeroCols.add(j);
        }
        // Создание новой матрицы
        int[][] result = new int[nonZeroRows.size()][nonZeroCols.size()];
        for (int i = 0; i < nonZeroRows.size(); i++) {
            for (int j = 0; j < nonZeroCols.size(); j++) {
                result[i][j] = a[nonZeroRows.get(i)][nonZeroCols.get(j)];
            }
        }
        // Вывод уплотненной матрицы
        System.out.println("Уплотненная матрица:");
        printMatrix(result);
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
