import java.util.Scanner;

public class Task3 {

    private static void calc(Scanner scanner) {

        System.out.println();
        System.out.println("      Калькулятор");
        System.out.println();
        System.out.println("     ОСНОВНОЕ МЕНЮ");
        System.out.println();
        System.out.println("=========================");
        System.out.println();
        System.out.println("1. Сложение чисел");
        System.out.println();
        System.out.println("2. Вычитание чисел");
        System.out.println();
        System.out.println("3. Умножение чисел");
        System.out.println();
        System.out.println("4. Деление чисел");
        System.out.println();
        System.out.print("Введите цифру из меню: ");
        int userInput = scanner.nextInt();
        if (userInput == 1) {
            sumNum(scanner);
        }
        if (userInput == 2) {
            diffNum(scanner);
        }
        if (userInput == 3) {
            prodNum(scanner);
        }
        if (userInput == 4) {
            divideNum(scanner);
        }

    }

    private static void checker(double op) {
        int flag = 0;
        for (int i = 1; i <= 10 ; i++){
            if (op % i == 0){
                flag++;
                break;
            }
        }
        if (flag > 0){
            int result = (int) op;
            System.out.println();
            System.out.println("Ответ: " + result);
        } else {
            String doubleRes = String.format("%.2f", op);
            System.out.println();
            System.out.printf("Ответ: %s", doubleRes);
            System.out.println();
        }
    }

    private static void sumNum(Scanner scanner) {
        System.out.println();
        System.out.print("Введите первое число: ");
        var num1 = scanner.next();
        System.out.println();
        System.out.print("Введите второе число: ");
        var num2 = scanner.next();
        double a = Double.parseDouble(num1);
        double b = Double.parseDouble(num2);
        double op = a + b;
        checker(op);
    }

    private static void diffNum(Scanner scanner) {
        System.out.println();
        System.out.print("Введите первое число: ");
        var num1 = scanner.next();
        System.out.println();
        System.out.print("Введите второе число: ");
        var num2 = scanner.next();
        double a = Double.parseDouble(num1);
        double b = Double.parseDouble(num2);
        double op = a - b;
        checker(op);
    }

    private static void prodNum(Scanner scanner) {
        System.out.println();
        System.out.print("Введите первое число: ");
        var num1 = scanner.next();
        System.out.println();
        System.out.print("Введите второе число: ");
        var num2 = scanner.next();
        double a = Double.parseDouble(num1);
        double b = Double.parseDouble(num2);
        double op = a * b;
        checker(op);
    }

    private static void divideNum(Scanner scanner) {
        System.out.println();
        System.out.print("Введите первое число: ");
        var num1 = scanner.next();
        System.out.println();
        System.out.print("Введите второе число: ");
        var num2 = scanner.next();
        double a = Double.parseDouble(num1);
        double b = Double.parseDouble(num2);
        double op = a / b;
        checker(op);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calc(scanner);
        scanner.close();
    }
}