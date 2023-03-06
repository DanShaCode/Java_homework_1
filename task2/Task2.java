public class Task2 {

    private static boolean Checker(int i) {
        int flag = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                flag++;
            } else {
                continue;
            }
        }
        if (flag > 2) {
            return false;
        } else {
            return true;
        }
    }

    private static void simpleNumbers(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++){
            boolean check = Checker(i);
            if ((i != 1) & (check)){
                System.out.print("    " + i + " ");
                counter++;
                if (counter % 7 == 0)
                System.out.println();
            } else { 
                continue;
            }
        }
    }    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Данная программа выводит таблицу простых чисел от 1 до 1000.");
        System.out.println();
        simpleNumbers(1000);
    }
}
