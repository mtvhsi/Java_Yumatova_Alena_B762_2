import java.util.Random;
import java.util.Scanner;

public class C12 {
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

        // Нахождение минимального элемента
        int minRow = 0, minCol = 0;
        int min = a[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }

        // Запрос позиции для перемещения
        System.out.print("Введите строку для перемещения (от 0 до " + (n - 1) + "): ");
        int targetRow = scanner.nextInt();
        System.out.print("Введите столбец для перемещения (от 0 до " + (n - 1) + "): ");
        int targetCol = scanner.nextInt();
        // Перестановка строк и столбцов
        int temp = a[targetRow][targetCol];
        a[targetRow][targetCol] = min;
        a[minRow][minCol] = temp;

        // Вывод измененной матрицы
        System.out.println("Матрица после перемещения минимального элемента:");
        printMatrix(a);
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
