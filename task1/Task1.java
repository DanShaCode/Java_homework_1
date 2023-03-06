import java.util.Scanner;

public class Task1 {

    private static void triNum(int number) {
        System.out.println();
        double formula = (0.5 * number) * (number + 1);
        int res = (int) formula;
        System.out.printf("T%d треугольное число = %d", number, res);
    }

    private static void numFact(int number) {
        System.out.println();
        long product = 1;
        for (int i = 1; i <= number; i++) {
            product *= i;
        }
        System.out.println();
        System.out.printf("Факториал чила (%d) = %d", number, product);
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Данная программа вычисляет N-е треугольное число и факториал.");
        System.out.println();
        System.out.print("Введите, пожалуйста, число: ");
        Scanner scanner = new Scanner(System.in);
        boolean flag = scanner.hasNextInt();
        if (flag) {
            int number = scanner.nextInt();
            triNum(number);
            numFact(number);
        } else {
            System.out.println();
            System.out.println("Ошибка ввода. Вам необходимо ввести целое положительное число.");
        }
        scanner.close();

    }
}