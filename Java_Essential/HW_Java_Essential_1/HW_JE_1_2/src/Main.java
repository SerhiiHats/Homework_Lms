import character.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle prime1 = new Rectangle();
        while (true) {
            System.out.println("Задайте прямоугольнику стороны А и В");
            System.out.println("Введите сторону А : ");
            if (scanner.hasNextDouble()) {
                prime1.setSide1(scanner.nextDouble());
            }
            else {
                System.out.println("Сторона задана неверно!");
                scanner.next();
                continue;
            }

            System.out.println("Введите сторону B : ");
            if (scanner.hasNextDouble()) {
                prime1.setSide2(scanner.nextDouble());
            }
            else {
                System.out.println("Сторона задана неверно!");
                scanner.next();
                continue;
            }
            System.out.println("Стороны прямоугольника : А = " + prime1.getSide1() + " , B = " + prime1.getSide2() + "\nПериметр прямоугольника = " + prime1.perimeterCalculator(prime1.getSide1(), prime1.getSide2()) + "\nПлощадь прямоугольника = " + prime1.areaCalculator(prime1.getSide1(), prime1.getSide2()));

            System.out.println("Вы хотите продолжить с другим прямоугольником? " + "\u001B[1;32m" + "Да - любой символ / Нет - \" 0 \":" + "\u001B[0m");
            if (scanner.next().equals("0")) {
                break;
            }

        }
        scanner.close();
    }
}

