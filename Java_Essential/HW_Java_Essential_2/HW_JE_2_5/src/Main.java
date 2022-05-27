import models.MyArea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean keyScanDoubl;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            keyScanDoubl = true;
            System.out.println("Расчет площади круга");
            while (keyScanDoubl) {
                System.out.print("Введите радиус окружности: ");
                if (scanner.hasNextDouble()) {
                    double radius = scanner.nextDouble();
                    MyArea.areOfCircle(radius);
                    keyScanDoubl = false;
                } else {
                    System.out.println("Неверное значение радиуса, проверте");
                    scanner.nextLine();
                }
            }

            System.out.println("Хотите Расчет площади круга с другим радиусом? Нет - 0 (цифра) / Да - любой другой символ ");
            if (scanner.next().equals("0")) {
                break;
            }
        }

    }
}
