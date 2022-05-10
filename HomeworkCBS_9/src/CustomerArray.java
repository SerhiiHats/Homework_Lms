import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CustomerArray {
    static void consider(int n) {
        int[] mas = new int[n];
        Random random = new Random();
        int maxValue;
        int minValue;
        int sumValue;

//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = (random.nextInt(20) - 10);
//        }
//         еще один способ заполнить массив произвольными
//         целыми значениями в заданном диапозоне

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) ((Math.random() * 100) - 50);
        }

        maxValue = mas[0];
        minValue = mas[0];
        sumValue = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > maxValue) {
                maxValue = mas[i];
            }
            if (mas[i] < minValue) {
                minValue = mas[i];
            }
            sumValue += mas[i];
        }
        System.out.println("1. наибольшее значение массива           = " + maxValue);
        System.out.println("2. наименьшее значение массива           = " + minValue);
        System.out.println("3. общая сумма всех элементов массива    = " + sumValue);
        System.out.println("4. среднее арифметическое всех элементов = " + (sumValue / (mas.length * 1d)));
        System.out.print("5. все нечетные значения массива         = ");

        for (int val : mas) {
            if ((val & 1) == 1) {
                System.out.print(val + ", ");
            }
        }

        System.out.println();
        System.out.println("6. все элементы массива                  = " + Arrays.toString(mas));

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int razmerMas;
        while (true) {
            System.out.println("Задайте размер одномерного массива, ввидите в концоль целое число длины массива");
            if (scanner.hasNextInt()) {
                razmerMas = scanner.nextInt();
                if (razmerMas > 0) {
                    consider(razmerMas);
                    break;
                } else {
                    System.out.println("Размер массива задан неверно, повторите ввод");
                    scanner.next();
                }
            } else {
                System.out.println("Размер массива задан неверно, повторите ввод");
                scanner.next();
            }
        }
        scanner.close();
    }
}
