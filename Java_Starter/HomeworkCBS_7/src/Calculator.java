import java.util.Scanner;

public class Calculator {

    static void sredneeZnacenie(int a, int b, int c) {
        System.out.println("Среднее арифметическое трех целых чисел = " + ((a + b + c) / 3d));
    }

    public static void main(String[] args) {
        int chislo1;
        int chislo2;
        int chislo3;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Определим среднее арифметическое значений трёх целочисленных аргументов:");
            System.out.println("Введите 1-е число");
            if (scanner.hasNextInt()) {
                chislo1 = scanner.nextInt();
            } else {
                System.out.println("Введено неверное значение, можно только целое число");
                scanner.nextLine();
                System.out.println();
                continue;
            }
            System.out.println("Введите 2-е число");
            if (scanner.hasNextInt()) {
                chislo2 = scanner.nextInt();
            } else {
                System.out.println("Введено неверное значение, можно только целое число");
                scanner.nextLine();
                System.out.println();
                continue;
            }
            System.out.println("Введите 3-е число");
            if (scanner.hasNextInt()) {
                chislo3 = scanner.nextInt();
            } else {
                System.out.println("Введено неверное значение, можно только целое число");
                scanner.nextLine();
                System.out.println();
                continue;
            }

            sredneeZnacenie(chislo1, chislo2, chislo3);
            System.out.println("Вы хотите продолжить с другими переменными: Да - любой символ / Нет - \" 0 \":");
            if (scanner.next().equalsIgnoreCase("0")) {
                break;
            }

        }
    }

}
