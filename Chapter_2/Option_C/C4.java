import java.util.Random;
import java.util.Scanner;
public class C4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Введите размерность матрицы n: ");
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        //Заполнение матрицы случайными числами
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rand.nextInt(2 * n + 1) - n; // значения от -n до n
            }
        }
        System.out.println("Исходная матрица:");
        printMatrix(a);
        // Сумма между положительными
        for (int i = 0; i < n; i++) {
            int firstPos = -1;
            int secondPos = -1;
            for (int j = 0; j < n; j++) {
                if (a[i][j] > 0) {
                    if (firstPos == -1) {
                        firstPos = j;
                    } else if (secondPos == -1) {
                        secondPos = j;
                        break;
                    }
                }
            }
            if (firstPos != -1 && secondPos != -1) {
                int sum = 0;
                for (int j = firstPos + 1; j < secondPos; j++) {
                    sum += a[i][j];
                }
                System.out.println("Сумма между положительными элементами в строке " + i + ": " + sum);
            } else {
                System.out.println("Нет двух положительных элементов в строке " + i);
            }
        }
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
