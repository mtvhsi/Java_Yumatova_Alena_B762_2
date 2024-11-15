import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Введите размерность матрицы n: ");
        int n = scanner.nextInt();
        int[][] a = new int[n][n];

        // Заполнение матрицы случайными числами
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rand.nextInt(2 * n + 1) - n;
            }
        }

        // Вывод матрицы
        System.out.println("Исходная матрица:");
        printMatrix(a);

        System.out.print("Введите количество позиций для сдвига k: ");
        int k = scanner.nextInt();

        // Циклический сдвиг вправо
        for (int i = 0; i < n; i++) {
            int[] temp = new int[n];
            for (int j = 0; j < n; j++) {
                temp[(j + k) % n] = a[i][j];
            }
            a[i] = temp;
        }

        // Вывод матрицы после сдвига
        System.out.println("Матрица после сдвига на " + k + " позиций вправо:");
        printMatrix(a);

        System.out.println("Разработчик: Юматова Алена Б762-2");
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
