import java.util.Scanner;

public class Conversion {
    static double convert(double d, double c) {
        return (int) (d * c * 100) / 100d;         // округление до сотых
    }

    public static void main(String[] args) {
        double valuta = 0;
        double kursValuta = 0;
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
            System.out.println("Вы ввели: " + valuta + " условной валюты. Введите курс выбраной валюты к гривне:");
            if (scan.hasNextDouble()) {
                kursValuta = scan.nextDouble();
            } else {
                System.out.println("Неверный ввод данных, можно ввести только число");
                scan.nextLine();
                System.out.println();
                continue;
            }
            System.out.println(valuta + " условной валюты, курс к гривне: " + kursValuta + ", после конвертации получите: " + convert(valuta, kursValuta) + " грн.");
            System.out.println("Вы хотите ввести новую валюту? продолжить Да / нет , введите в концоль свой выбор:");
            if (scan.next().equalsIgnoreCase("нет")) {
                break;
            }
        }
        System.out.println("Конец программы");
    }
}

