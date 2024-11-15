import java.util.Random;
import java.util.Scanner;

public class C8 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Введите размерность матрицы n (2 или 3): ");
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

        // Вычисление определителя
        int det = determinant(a);
        System.out.println("Определитель матрицы: " + det);
        System.out.println("Разработчик: Юматова Алена Б762-2");
    }

    private static int determinant(int[][] matrix) {
        if (matrix.length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else if (matrix.length == 3) {
            return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                    - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                    + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        }
        return 0; // поддержка только 2x2 и 3x3
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
