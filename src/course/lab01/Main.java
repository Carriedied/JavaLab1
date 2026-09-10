package course.lab01;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            printUsage();
            return;
        }

        String command = args[0];

        switch (command) {
            case "fizzbuzz":
                FizzBuzz.run();
                break;

            case "reverse":
                if (args.length < 2) {
                    System.out.println("Ошибка: команда reverse требует строку в качестве аргумента.");
                    printUsage();
                } else {
                    TextTasks.reverse(args[1]);
                }
                break;

            case "quadratic":
                if (args.length < 4) {
                    System.out.println("Ошибка: команда quadratic требует 3 коэффициента (a, b, c).");
                    printUsage();
                } else {
                    QuadraticEquation.solve(args[1], args[2], args[3]);
                }
                break;

            case "series":
                SeriesCalculator.calculate();
                break;

            case "palindrome":
                if (args.length < 2) {
                    System.out.println("Ошибка: команда palindrome требует строку в качестве аргумента.");
                    printUsage();
                } else {
                    TextTasks.palindrome(args[1]);
                }
                break;

            default:
                System.out.println("Неизвестная команда: " + command);
                printUsage();
                break;
        }
    }

    private static void printUsage() {
        System.out.println("Использование программы:");
        System.out.println("  fizzbuzz                  — запуск задачи FizzBuzz");
        System.out.println("  reverse <строка>          — разворот строки");
        System.out.println("  quadratic <a> <b> <c>     — решение квадратного уравнения");
        System.out.println("  series                    — вычисление суммы ряда");
        System.out.println("  palindrome <строка>       — проверка строки на палиндром");
    }
}
