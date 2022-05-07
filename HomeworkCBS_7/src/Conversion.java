import java.util.Scanner;

public class Conversion {
    static double convert(double d, double c) {
        return (int) (d * c * 100) / 100d;         // округление до сотых
    }

    public static void main(String[] args) {
        double valuta;
        double kursValuta;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите количество условной валюты:");
            if (scan.hasNextDouble()) {
                valuta = scan.nextDouble();
            } else {
                System.out.println("Неверный ввод данных, можно ввести только число");
                scan.nextLine();
                System.out.println();
                continue;
            }
            System.out.println("Вы ввели: " + valuta + " условной валюты. Введите курс к др.валюте:");
            if (scan.hasNextDouble()) {
                kursValuta = scan.nextDouble();
            } else {
                System.out.println("Неверный ввод данных, можно ввести только число или через \" , \"");
                scan.nextLine();
                System.out.println();
                continue;
            }
            System.out.println("В наличии условной валюты: " + valuta + "\nкурс к др.валюте:          " + kursValuta + " \nпосле конвертации:         " + convert(valuta, kursValuta));
            System.out.println("Продолжить? " + "\u001B[1;32m" + "(0 - выход/ люб.символ - продолжить):" + "\u001B[0m");
            if (scan.next().equals("0")) {
                break;
            }
        }
        System.out.println("Конец программы");
    }
}

