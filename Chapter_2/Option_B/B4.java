public class B4 {
    public static void main(String[] args) {
        /** Выводим числа от 1 до 100, которые делятся на 3 */
        System.out.println("Числа от 1 до 100, делящиеся на 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Разработчик: Юматова Алена Б762-2");
    }
}
