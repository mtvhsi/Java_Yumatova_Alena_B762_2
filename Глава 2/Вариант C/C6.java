import java.util.Random;
import java.util.Scanner;
public class C6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Введите размерность матрицы n: ");
        int n = scanner.nextInt();
        double[][] a = new double[n][n];
        // Заполнение матрицы случайными числами
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rand.nextDouble() * (2 * n) - n; // значения от -n до n
            }
        }
        // Вывод исходной матрицы
        System.out.println("Исходная матрица:");
        printMatrix(a);
        // Округление матрицы
        int[][] roundedMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                roundedMatrix[i][j] = (int) Math.round(a[i][j]);
            }
        }
        // Вывод округленной матрицы
        System.out.println("Округленная матрица:");
        printMatrix(roundedMatrix);
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
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.printf("%3d ", elem);
            }
            System.out.println();
        }
    }
}
