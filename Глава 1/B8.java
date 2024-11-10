import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Введите " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (countOccurrences(numbers, numbers[i]) < countOccurrences(numbers, numbers[j])) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("Числа в порядке убывания частоты встречаемости:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static int countOccurrences(int[] numbers, int target) {
        int count = 0;
        for (int number : numbers) {
            if (number == target) {
                count++;
            }
        }
        return count;
    }
}
