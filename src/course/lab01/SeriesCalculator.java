package course.lab01;

public class SeriesCalculator {
    public static void calculate() {
        double sum = 0.0;
        int n = 2;
        int count = 0;

        while (true) {
            double term = 1.0 / ((double) n * n + n - 2);

            if (Math.abs(term) < 1e-6) {
                break;
            }

            sum += term;
            count++;
            n++;
        }

        int lastN = n - 1;

        System.out.println("Вычисленная сумма: " + sum);
        System.out.println("Последний добавленный номер n: " + lastN);
        System.out.println("Количество добавленных членов ряда: " + count);
    }
}
