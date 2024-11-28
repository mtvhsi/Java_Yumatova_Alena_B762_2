import java.util.Random;
import java.util.Scanner;

public class C7 {
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
        System.out.print("Введите угол поворота (90, 180, 270): ");
        int angle = scanner.nextInt();
        if (angle == 90) {
            a = rotate90(a);
        } else if (angle == 180) {
            a = rotate180(a);
        } else if (angle == 270) {
            a = rotate270(a);
        } else {
            System.out.println("Неправильный угол поворота.");
        }

        // Вывод повернутой матрицы
        System.out.println("Повернутая матрица:");
        printMatrix(a);

        System.out.println("Разработчик: Юматова Алена Б762-2");
    }

    private static int[][] rotate90(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }
        return rotated;
    }

    private static int[][] rotate180(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[n - 1 - i][n - 1 - j] = matrix[i][j];
            }
        }
        return rotated;
    }
    private static int[][] rotate270(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[n - 1 - j][i] = matrix[i][j];
            }
        }
        return rotated;
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
