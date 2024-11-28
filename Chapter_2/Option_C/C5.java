import java.util.Scanner;
public class C5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность матрицы N: ");
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        int num = 1;
        // Заполнение матрицы числами от 1 до n*n
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = num++;
            }
        }
        // Вывод матрицы
        System.out.println("Матрица N x N:");
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
