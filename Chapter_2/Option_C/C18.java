import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class C18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Введите количество строк m: ");
        int m = scanner.nextInt();
        System.out.print("Введите количество столбцов n: ");
        int n = scanner.nextInt();
        int[][] a = new int[m][n];

        //аполнение матрицы случайными чилами
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rand.nextInt(10) - 5; // значения от -5 до 4
            }
        }

        //Вывод исходной матрицы
        System.out.println("Исходная матрица:");
        printMatrix(a);

        //Определение коэффициентов (сумма модулей) и сортировка
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, Comparator.comparingInt(i -> {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += Math.abs(a[j][i]);
            }
            return -sum; // сортировка по убыванию
        }));
        int[][] sortedMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sortedMatrix[i][j] = a[i][indices[j]];
            }
        }
        // Вывод отсортированной матрицы
        System.out.println("Матрица после сортировки столбцов по характеристикам:");
        printMatrix(sortedMatrix);
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
