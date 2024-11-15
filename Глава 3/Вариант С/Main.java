import java.util.ArrayList;
import java.util.List;

class VectorR3 {
    private final double x;
    private final double y;
    private final double z;
    public VectorR3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //проверка на ортогональность
    public boolean isOrthogonal(VectorR3 other) {
        return dotProduct(other) == 0;
    }
    //Скалярное произведение
    private double dotProduct(VectorR3 other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }
    //лина вектора
    private double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    //сравнение векторов по длине
    public boolean compareMagnitude(VectorR3 other) {
        return Double.compare(this.magnitude(), other.magnitude()) == 0;
    }
    //Пересекаются ли неортогональные и некопланарные векторы
    public boolean intersects(VectorR3 other) {
        // Если векторы не параллельны и не ортогональны, они считаются "пересекающаяся пара"
        return !this.isOrthogonal(other) && !this.isParallelTo(other);
    }
    // Параллельность векторов
    public boolean isParallelTo(VectorR3 other) {
        //gпроверяем пропорциональны ли компоненты
        double factorXY = this.x / other.x;
        double factorYZ = this.y / other.y;
        double factorZX = this.z / other.z;
        return Double.compare(factorXY, factorYZ) == 0 && Double.compare(factorYZ, factorZX) == 0;
    }
    // Проверка на компланарность трех векторов
    public static boolean areCoplanar(VectorR3 v1, VectorR3 v2, VectorR3 v3) {
        //Вычислим смешанное произведение
        double mixedProduct = v1.x * (v2.y * v3.z - v2.z * v3.y) -
                v1.y * (v2.x * v3.z - v2.z * v3.x) +
                v1.z * (v2.x * v3.y - v2.y * v3.x);
        return Double.compare(mixedProduct, 0) == 0;
    }
    @Override
    public String toString() {
        return "Vector(" + x + ", " + y + ", " + z + ")";
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Юматова А.С. Б762-2 Вариант 13");
        List<VectorR3> vectors = new ArrayList<>();
        vectors.add(new VectorR3(1, 2, 3));
        vectors.add(new VectorR3(4, 5, 6));
        vectors.add(new VectorR3(-1, -2, -3));
        vectors.add(new VectorR3(2, 4, 6));
        vectors.add(new VectorR3(1, 0, 0));
        // Проверка на ортогональности и компланарности
        for (int i = 0; i < vectors.size(); i++) {
            for (int j = i + 1; j < vectors.size(); j++) {
                VectorR3 v1 = vectors.get(i);
                VectorR3 v2 = vectors.get(j);
                System.out.println(v1 + " и " + v2 +
                        (v1.isOrthogonal(v2) ? " ортогональны" : " не ортогональны"));
                System.out.println(v1 + " и " + v2 +
                        (v1.intersects(v2) ? " пересекаются" : " не пересекаются"));
            }
        }
        //Определение компланарных векторов
        for (int i = 0; i < vectors.size(); i++) {
            for (int j = i + 1; j < vectors.size(); j++) {
                for (int k = j + 1; k < vectors.size(); k++) {
                    VectorR3 v1 = vectors.get(i);
                    VectorR3 v2 = vectors.get(j);
                    VectorR3 v3 = vectors.get(k);
                    if (VectorR3.areCoplanar(v1, v2, v3)) {
                        System.out.println(v1 + ", " + v2 + " и " + v3 + " компланарны");
                    }
                }
            }
        }
    }
}
