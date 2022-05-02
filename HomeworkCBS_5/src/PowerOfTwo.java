import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scCh = new Scanner(System.in);
        boolean boolVar = true;
        int chislo;
        System.out.println("   Домашнее задание 5 \n   Задание 5: \nПрограмма которая будет выполнять проверку – является ли указанное число степенью двойки или нет.");

        while (boolVar) {
            System.out.println("Для проверки введите любое целое число: ");
            chislo = scCh.nextInt();
            if (chislo != 0) {
                if ((chislo & (chislo - 1)) == 0) {
                    System.out.println("Число: " + chislo + " - является степенью двойки!");
                } else {
                    System.out.println("Число: " + chislo + " - не является степенью двойки!");
                }
            } else {
                System.out.println("Число: 0 - не является степенью никакого числа!");
            }
            System.out.println("Для продолжения нажмите любой символ / для вихода нажмите \" q \" ");
            if (scCh.next().equalsIgnoreCase("q")) {
                boolVar = false;
            }
        }
        System.out.println("Конец программы");
        scCh.close();
    }
}