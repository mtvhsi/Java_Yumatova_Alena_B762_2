package B8;

import java.util.*;

public class B8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        Integer[] numbers = new Integer[n];  // Используем Integer вместо int
        System.out.println("Введите " + n + " чисел:");
        ////Заполнение массива
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        ///Подсчет частоты встречаемости с помощью мапов
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
        //Сортировка массива по частоте встречаемости
        Arrays.sort(numbers, (a, b) -> frequencyMap.get(b).compareTo(frequencyMap.get(a)));
        System.out.println("Числа в порядке убывания частоты встречаемости:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
