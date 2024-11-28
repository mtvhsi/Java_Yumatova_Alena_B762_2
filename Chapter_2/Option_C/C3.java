import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C3 { // Переименуйте файл в С3.java
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

        // Вывод матрицы
        System.out.println("Исходная матрица:");
        printMatrix(a);

        int maxCount = findMaxConsecutive(a);
        System.out.println("Наибольшее количество подряд идущих элементов: " + maxCount);
        System.out.println("Разработчик: Юматова Алена Б762-2");
    }

    private static int findMaxConsecutive(int[][] matrix) {
        int maxCount = 1;

        for (int i = 0; i < matrix.length; i++) {
            maxCount = Math.max(maxCount, findMaxInRow(matrix[i]));
            maxCount = Math.max(maxCount, findMaxInCol(matrix, i));
        }

        return maxCount;
    }

    private static int findMaxInRow(int[] row) {
        int count = 1, maxCount = 1;
        for (int i = 1; i < row.length; i++) {
            if (row[i] > row[i - 1]) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }
        maxCount = Math.max(maxCount, count); // для случая, если ряд заканчивается на возрастающем
        return maxCount;
    }

    private static int findMaxInCol(int[][] matrix, int col) {
        int count = 1, maxCount = 1;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][col] > matrix[i - 1][col]) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }
        maxCount = Math.max(maxCount, count); // если колонка заканчивается на возрастающем
        return maxCount;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
