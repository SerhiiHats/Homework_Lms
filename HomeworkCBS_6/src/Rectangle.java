import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean klucVihoda = true;
        int a;
        int b;
        System.out.println("   Домашнее задание 6 \n   Задание 5 \nНарисуем прямоугольник из звездочек. \nВам необходими задайть значения сторонам прямоугольника");
        while (klucVihoda) {
            System.out.println("Введите высоту прямоугольника - a: ");
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
            } else {
                System.out.println("\u001B[31m" + "Упссс.. высота и ширина (a  и b) прямоугольника могут быть только целые числа, повторите ввод:" + "\u001B[0m");
                scanner.nextLine();
                System.out.println();
                continue;
            }
            System.out.println("Введите ширину прямоугольника - b: ");
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
            } else {
                System.out.println("\u001B[31m" + "Упссс.. высота и ширина (a  и b) прямоугольника могут быть только целые числа, повторите ввод:" + "\u001B[0m");
                scanner.nextLine();
                System.out.println();
                continue;
            }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("Продолжим? нажмите любой символ / для выхода нажмите \" q \":");
                if (scanner.next().equalsIgnoreCase("q")) {
                klucVihoda = false;
                 }
        }
        scanner.close();
    }
}
