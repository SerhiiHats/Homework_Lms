import java.util.Scanner;

public class Calculator {

    static double[] calculate(int a, int b, int c) {
        double[] masDiv5 = new double[3];
        masDiv5[0] = a / 5d;
        masDiv5[1] = b / 5d;
        masDiv5[2] = c / 5d;
        return masDiv5;
    }

    public static void main(String[] args) {
        int chisloA;
        int chisloB;
        int chisloC;
        Scanner scanChisla = new Scanner(System.in);
        while (true) {
            System.out.println("Введите три целочисленных значения А, В и С: \nвведите A:");
            if (scanChisla.hasNextInt()) {
                chisloA = scanChisla.nextInt();
            } else {
                System.out.println("Вы ввели не целое число, повторите сначала");
                scanChisla.nextLine();
                continue;
            }
            System.out.println("введите B:");
            if (scanChisla.hasNextInt()) {
                chisloB = scanChisla.nextInt();
            } else {
                System.out.println("Вы ввели не целое число, повторите сначала");
                scanChisla.nextLine();
                continue;
            }
            System.out.println("введите C:");
            if (scanChisla.hasNextInt()) {
                chisloC = scanChisla.nextInt();
            } else {
                System.out.println("Вы ввели не целое число, повторите сначала");
                scanChisla.nextLine();
                continue;
            }

            double[] masDiv5Prinjat = calculate(chisloA, chisloB, chisloC);
            System.out.println("Числа которые были введены первоначально:");
            System.out.println(chisloA + ", " + chisloB + ", " + chisloC + ", ");
            System.out.println("Числа деленные на 5 каждое:");
            for (int i = 0; i < 3; i++) {
                System.out.print(masDiv5Prinjat[i] + ", ");
            }
            System.out.println();
            System.out.println("Вы хотите продолжить с другими переменными: " + "\u001B[1;32m" + "Да - любой символ / Нет - \" 0 \":" + "\u001B[0m");
            if (scanChisla.next().equals("0")) {
                break;
            } else {
                scanChisla.nextLine();
            }
        }
    }
}