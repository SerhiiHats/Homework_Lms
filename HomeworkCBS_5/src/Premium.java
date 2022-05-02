import java.util.NoSuchElementException;
import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        int vislugaLet = -1;
        int razmerPrem = 10;
        int shetchik = 0;
        Scanner scanVislyga = new Scanner(System.in);
        System.out.println("   Домашнее задание 5 \n   Задание 4: \nПрограмма расчета начисления премий сотрудникам.");
        while (true) {
            System.out.println("Введите выслугу лет сотрудника:");
            try {
                vislugaLet = scanVislyga.nextInt();
                if (vislugaLet >= 0 & vislugaLet < 5) razmerPrem = 10;
                else if (vislugaLet >= 5 & vislugaLet < 10) razmerPrem = 15;
                else if (vislugaLet >= 10 & vislugaLet < 15) razmerPrem = 25;
                else if (vislugaLet >= 15 & vislugaLet < 20) razmerPrem = 35;
                else if (vislugaLet >= 20 & vislugaLet < 25) razmerPrem = 45;
                else if (vislugaLet >= 25) razmerPrem = 50;
                if (vislugaLet < 0) {
                    System.out.println("\u001B[31m" + "Значение не принято!" + "\u001B[0m" + " Выслуга лет может быть только целое число больше 0, проверте и наследующем шаге введите повторно:");
                    continue;
                } else {
                    shetchik++;
                    System.out.println(shetchik + "-й сотрудник, выслуга лет: " + vislugaLet + ", размер премии составляет: " + razmerPrem + " %");
                }
            } catch (NoSuchElementException e) {
                System.out.println("\u001B[31m" + "Значение не принято!" + "\u001B[0m" + " Выслуга лет может быть только целое число");
            }
                System.out.println("Для продолжения нажмите любой символ, для выхода нажмите \" q \" :");
                if (scanVislyga.next().equalsIgnoreCase("q")) break;
        }
        System.out.println("Конец программы");
        scanVislyga.close();
    }
}
