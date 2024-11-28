public class A5 {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;

        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);
                sum += number;
                product = number;
            } catch (NumberFormatException e) {
                System.err.println("Ошибка: '" + arg + "' не является целым числом.");
                return;
            }
        }

        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
    }
}
