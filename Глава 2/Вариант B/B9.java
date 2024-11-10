import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /** Ввод числа от 1 до 12 */
        System.out.println("Введите число от 1 до 12:");
        int month = scanner.nextInt();
        /** Проверка введенного числа и вывод названия месяца */
        switch (month) {
            case 1: System.out.println("Январь"); break;
            case 2: System.out.println("Февраль"); break;
            case 3: System.out.println("Март"); break;
            case 4: System.out.println("Апрель"); break;
            case 5: System.out.println("Май"); break;
            case 6: System.out.println("Июнь"); break;
            case 7: System.out.println("Июль"); break;
            case 8: System.out.println("Август"); break;
            case 9: System.out.println("Сентябрь"); break;
            case 10: System.out.println("Октябрь"); break;
            case 11: System.out.println("Ноябрь"); break;
            case 12: System.out.println("Декабрь"); break;
            default: System.out.println("Некорректный ввод!"); break;
        }

        System.out.println("Разработчик: Юматова Алена Б762-2");
        scanner.close();
    }
}
