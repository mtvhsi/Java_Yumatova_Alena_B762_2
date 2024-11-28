import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /** Ввод чисел из консоли */
        System.out.println("Введите числа, разделяя пробелом ");

        String[] num = scanner.nextLine().split(" ");
        String result = null;
        int minNum = Integer.MAX_VALUE;

        /** Поиск числа с минимальным количеством уникальных цифр */
        for (String n : num) {
            int uniqueCount = (int) n.chars().distinct().count();
            if (uniqueCount < minNum) {
                minNum = uniqueCount;
                result = n;
            }
        }
        System.out.printf("Число с минимальным количеством различных цифр: %s%n", result);

        String developerName = "Юматова Алена Б762-2";
        System.out.println("Разработчик: " + developerName);

        scanner.close();
    }
}
