import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("Коэффициент a не может быть равен 0.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] findRoots() {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[]{root1, root2};
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // Нет действительных корней
            return new double[]{};
        }
    }

    public double findVertex() {
        return -b / (2 * a);
    }

    public String intervals() {
        double vertex = findVertex();
        if (a > 0) {
            return "Убывание: (-∞, " + vertex + ") Возрастание: (" + vertex + ", ∞)";
        } else {
            return "Возрастание: (-∞, " + vertex + ") Убывание: (" + vertex + ", ∞)";
        }
    }

    @Override
    public String toString() {
        return "Уравнение: " + a + "x² + " + b + "x + " + c + " = 0";
    }
}

public class Main {
    public static void main(String[] args) {
        List<QuadraticEquation> equations = new ArrayList<>();
        equations.add(new QuadraticEquation(1, -3, 2));    // x² - 3x + 2 = 0
        equations.add(new QuadraticEquation(1, -2, 1));    // x² - 2x + 1 = 0
        equations.add(new QuadraticEquation(1, 0, -4));    // x² - 4 = 0
        equations.add(new QuadraticEquation(2, -4, 2));    // 2x² - 4x + 2 = 0
        equations.add(new QuadraticEquation(1, 2, 1));     // x² + 2x + 1 = 0

        double largestRoot = Double.NEGATIVE_INFINITY;
        double smallestRoot = Double.POSITIVE_INFINITY;

        System.out.print("Юматова А.С. Б762-2 Вариант 13 (задание 3)");
        for (QuadraticEquation equation : equations) {
            double[] roots = equation.findRoots();
            for (double root : roots) {
                if (root > largestRoot) {
                    largestRoot = root;
                }
                if (root < smallestRoot) {
                    smallestRoot = root;
                }
            }

            System.out.println(equation);
            System.out.println("Корни: " + (roots.length == 0 ? "Нет действительных корней" : java.util.Arrays.toString(roots)));
            System.out.println("Вершина: x = " + equation.findVertex());
            System.out.println("Интервалы: " + equation.intervals());
            System.out.println();
        }
        System.out.println("Наибольший корень: " + (largestRoot == Double.NEGATIVE_INFINITY ? "Нет действительных корней" : largestRoot));
        System.out.println("Наименьший корень: " + (smallestRoot == Double.POSITIVE_INFINITY ? "Нет действительных корней" : smallestRoot));
    }
}
