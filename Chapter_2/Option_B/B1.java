public class B1 {
    public static void main(String[] args) {
        /** Выводим таблицу умножения от 1 до 10 */
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j); // Форматированный вывод
            }
            System.out.println(); // Переход на новую строку
        }
        System.out.println("Разработчик: Юматова Алена Б762-2");
    }
}
