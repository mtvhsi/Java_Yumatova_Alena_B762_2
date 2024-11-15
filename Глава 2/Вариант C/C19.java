import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Введите размерность квадратной матрицы n: ");
        int n = scanner.nextInt();
        double[][] a = new double[n][n];
        //аполнение матрицы случайными числами
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rand.nextDouble() * 10; // значения от 0 до 10
            }
        }
        // Вывод исходной матрицы
        System.out.println("Исходная матрица:");
        printMatrix(a);
        // Извлечение всех элементов в одном массиве и сортировка
        double[] elements = new double[n * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                elements[index++] = a[i][j];
            }
        }
        Arrays.sort(elements);
        // Размещение самых больших элементов на главной диагонали
        index = elements.length - 1; // начиная с максимального
        for (int i = 0; i < n; i++) {
            a[i][i] = elements[index--]; // заполняем главную диагональ
        }
        // Вывод измененной матрицы
        System.out.println("Матрица после размещения на главной диагонали:");
        printMatrix(a);
        System.out.println("Разработчик: Юматова Алена Б762-2");
    }
    private static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double elem : row) {
                System.out.printf("%5.2f ", elem);
            }
            System.out.println();
        }
    }
}
