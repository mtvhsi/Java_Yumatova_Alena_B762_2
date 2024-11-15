import java.util.Random;
import java.util.Scanner;

public class C9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Введите размерность матрицы n: ");
        int n = scanner.nextInt();
        double[][] a = new double[n][n];
        // Заполнение матрицы случайными числами
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rand.nextInt(2 * n + 1) - n; // значения от -n до n
            }
        }
        // Вывод исходной матрицы
        System.out.println("Исходная матрица:");
        printMatrix(a);

        // Вычитание среднего
        double[][] result = new double[n][n];
        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[i][j];
            }
            double mean = sum / n;
            for (int j = 0; j < n; j++) {
                result[i][j] = a[i][j] - mean;
            }
        }
        // Вывод результата
        System.out.println("Матрица после вычитания среднего:");
        printMatrix(result);
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
