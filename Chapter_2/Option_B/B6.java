public class B6 {
    public static void main(String[] args) {
        int decimal = 81;
        /** Находим основание, в котором десятичное число 81 записывается как 100 */
        int base = 0;
        for (int i = 2; i < 100; i++) {
            int convert = (int) (Math.pow(i, 2)); // 100 = i^2
            if (convert == decimal) {
                base = i;
                break;
            }
        }
        /** Вывод результата */
        System.out.printf("Основание системы счисления, в которой число 81 записывается как 100: %d%n", base);
        System.out.println("Разработчик: Юматова Алена Б762-2");
    }
}
