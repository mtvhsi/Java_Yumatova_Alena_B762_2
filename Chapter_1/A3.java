import java.util.Random;

public class A3 {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 10;
        System.out.print("Вывод случайных чисел с переходом на новую строку: ");
        for (int i = 0; i < count; i++) {
            System.out.println(random.nextInt());
        }
        System.out.print("Вывод случайных чисел без перехода на новую строку: ");
        for (int i = 0; i < count; i++) {
            System.out.print(random.nextInt() + " ");
        }
    }
}
