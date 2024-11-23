package B8;

import java.util.*;

public class B8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        Integer[] numbers = new Integer[n];
        System.out.println("Введите " + n + " чисел:");
        ////заполнение массива
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        ///подсчет частоты встречаемости с помощью мапов
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);////возвращает текущее значение частоты для number, если оно существует, иначе возвращает 0 и  значение частоты+ 1 и сохраняется обратно в frequencyMap.
        }
        //Сортировка массива по частоте встречаемости
        Arrays.sort(numbers, (a, b) -> frequencyMap.get(b).compareTo(frequencyMap.get(a))); ///если frequencyMap.get(b) больше, чем frequencyMap.get(a), то b будет стоять перед a
        System.out.println("Числа в порядке убывания частоты встречаемости:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
