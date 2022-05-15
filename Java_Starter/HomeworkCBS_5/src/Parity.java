import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner scCh = new Scanner(System.in);
        boolean boolVar = true;
        System.out.println("   Домашнее задание 5 \n   Задание 2: \nПрограмма которая будет выполнять проверку чисел на четность.");
        System.out.println("1. Способ проверки Побитовым сравнением.     2. способ проверки Арифметическим выражением.");
        System.out.println("\u001B[32m" + "Нажмите 1 или 2 для выбора способа сравнения, для завершения работы нажмите любой другой символ"+ "\u001B[0m");

        switch (scCh.next()) {
            case "1": {
                while (boolVar) {
                    System.out.println("\u001B[32m" + "Способ № 1 - побитовое сравнение." + "\u001B[0m" + "\nДля проверки на четность введите любое целое число");
                    int a = scCh.nextInt();
                    int b = 1;
                    if ((a & b) == 0) {
                        System.out.println("Вы ввели: " + a + " - число является ЧЕТНЫМ!");
                    } else {
                        System.out.println("Вы ввели: " + a + " - число является НЕ ЧЕТНЫМ");
                    }
                    System.out.println("Для продолжения нажмите любой символ / для вихода нажмите \" q \" ");
                    String str = scCh.next();
                    if (str.equalsIgnoreCase("q")) {
                        boolVar = false;
                    }
                }
                break;
            }

            case "2": {
                while (boolVar) {
                    System.out.println("\u001B[32m" + "Способ № 2 - арифметическое выражение." + "\u001B[0m" + "\nДля проверки на четность введите любое целое число");
                    int a = scCh.nextInt();
                    if (a % 2 == 0) {
                        System.out.println("Вы ввели: " + a + " - число является ЧЕТНЫМ!");
                    } else {
                        System.out.println("Вы ввели: " + a + " - число является НЕ ЧЕТНЫМ");
                    }
                    System.out.println("Для продолжения нажмите любой символ / для вихода нажмите \" q \" ");
                    String str = scCh.next();
                    if (str.equalsIgnoreCase("q")) {
                        boolVar = false;
                    }
                }
                break;
            }

            default: {
                System.out.println("Не было выбрано : 1 или 2 , программа завершает работу");
            }

        }
        System.out.println("Конец программы");
        scCh.close();
    }
}
