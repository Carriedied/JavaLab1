package course.lab01;

public class QuadraticEquation {
    public static void solve(String aStr, String bStr, String cStr) {
        double a = Double.parseDouble(aStr);
        double b = Double.parseDouble(bStr);
        double c = Double.parseDouble(cStr);

        if (a == 0) {
            System.out.println("Ошибка: коэффициент 'a' не может быть равен нулю, уравнение не является квадратным.");
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Два вещественных корня: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Один вещественный корень: x = " + x);
        } else {
            System.out.println("Вещественных корней нет");
        }
    }
}
