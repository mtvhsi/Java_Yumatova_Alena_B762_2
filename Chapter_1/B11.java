import java.util.Scanner;
public class B11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Элементы, равные полусумме соседних:");
        for (int i = 1; i < n - 1; i++) {
            int leftNeighbor = numbers[i - 1];
            int rightNeighbor = numbers[i + 1];
            int halfSum = (leftNeighbor + rightNeighbor) / 2;

            if (numbers[i] == halfSum) {
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println();
    }
}
