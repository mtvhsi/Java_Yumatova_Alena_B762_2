import java.util.Random;
import java.util.Scanner;

public class C14 {
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

        // Нахождение седловых точек
        int saddlePointsCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = a[i][j];
                boolean isMinInRow = true;
                for (int col = 0; col < n; col++) {
                    if (a[i][col] < value) {
                        isMinInRow = false;
                        break;
                    }
                }
                if (isMinInRow) {
                    boolean isMaxInCol = true;
                    for (int row = 0; row < n; row++) {
                        if (a[row][j] > value) {
                            isMaxInCol = false;
                            break;
                        }
                    }
                    if (isMaxInCol) {
                        saddlePointsCount++;
                    }
                }
            }
        }
        System.out.println("Количество седловых точек: " + saddlePointsCount);
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
