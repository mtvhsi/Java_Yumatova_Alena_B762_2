public class B5 {
    public static void main(String[] args) {
        int number = 129;
        /** Считаем количество значащих нулей в двоичной записи числа 129 */
        String binaryString = Integer.toBinaryString(number);
        int s = 0;

        for (char c : binaryString.toCharArray()) {
            if (c == '0') {
                s++;
            }
        }
        System.out.printf("Количество значащих нулей в двоичной записи числа %d: %d%n", number, s);
        System.out.println("Разработчик: Юматова Алена Б762-2");
    }
}
