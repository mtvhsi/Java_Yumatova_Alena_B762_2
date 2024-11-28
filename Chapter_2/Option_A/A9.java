
public class A9 {
    public static void main(String[] args) {
        /** Параметры квадратного уравнения a, b, c передаются через командную строку */
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        /** Вычисление дискриминанта */
        double discriminant = b * b - 4 * a * c;
        /** Вывод корней уравнения */
        if (discriminant < 0) {
            System.out.println("Корней нет.");
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("Корень: %.2f%n", root);
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Корни: %.2f, %.2f%n", root1, root2);
        }
        String developerName = "Юматова Алена Б762-2";
        System.out.println("Разработчик: " + developerName);
    }
}
