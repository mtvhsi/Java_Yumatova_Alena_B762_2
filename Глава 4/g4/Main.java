package g4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Разработчик Юматова А.С. Б762-2 13 Вариант");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        Array array1 = new Array(n);
        Array array2 = new Array(n);

        System.out.println("Введите элементы первого массива:");
        int[] values1 = new int[n];
        for (int i = 0; i < n; i++) {
            values1[i] = scanner.nextInt();
        }
        array1.create(values1);

        System.out.println("Введите элементы второго массива:");
        int[] values2 = new int[n];
        for (int i = 0; i < n; i++) {
            values2[i] = scanner.nextInt();
        }
        array2.create(values2);

        array1.display();
        array2.display();

        Array sumArray = array1.add(array2);
        System.out.print("Сумма массивов: ");
        sumArray.display();

        Array subtractArray = array1.subtract(array2);
        System.out.print("Разность массивов: ");
        subtractArray.display();

        Array multiplyArray = array1.multiply(array2);
        System.out.print("Произведение массивов: ");
        multiplyArray.display();
    }
}
