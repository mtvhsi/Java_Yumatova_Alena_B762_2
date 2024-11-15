import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C10 {
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
        // Поиск максимального элемента
        int max = Integer.MIN_VALUE;
        List<Integer> maxRows = new ArrayList<>();
        List<Integer> maxCols = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    maxRows.clear();
                    maxCols.clear();
                    maxRows.add(i);
                    maxCols.add(j);
                } else if (a[i][j] == max) {
                    if (!maxRows.contains(i)) maxRows.add(i);
                    if (!maxCols.contains(j)) maxCols.add(j);
                }
            }
        }
        // Удаление строк и столбцов
        int newRowCount = n - maxRows.size();
        int newColCount = n - maxCols.size();
        int[][] result = new int[newRowCount][newColCount];
        int newRow = 0;

        for (int i = 0; i < n; i++) {
            if (maxRows.contains(i)) continue;
            int newCol = 0;
            for (int j = 0; j < n; j++) {
                if (maxCols.contains(j)) continue;
                result[newRow][newCol++] = a[i][j];
            }
            newRow++;
        }

        // Вывод новой матрицы
        System.out.println("Матрица после удаления максимальных элементов:");
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
