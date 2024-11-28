public class B2 {
    public static void main(String[] args) {
        /** Исходный массив */
        char[] array = {'A', 'B', 'C', 'D', 'E'};
        /** Вывод элементов массива в обратном порядке */
        System.out.println("Элементы массива в обратном порядке:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        /** Вывод фамилии разработчика */
        System.out.println("Разработчик: Юматова Алена Б762-2");
    }
}
