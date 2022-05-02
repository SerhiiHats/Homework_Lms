import java.util.InputMismatchException;
import java.util.Scanner;

class Interval {
    public static void main(String[] args) {
        Scanner scanZnach = new Scanner(System.in);
        while (true) {
            System.out.println("Введите целое число от 0 до 100");
            try {
                int chisloPolzovatelya = scanZnach.nextInt();
                if (chisloPolzovatelya >= 0 & chisloPolzovatelya <= 14) {
                    System.out.println("Число в диапозоне [0 - 14]");
                } else if (chisloPolzovatelya >= 15 & chisloPolzovatelya <= 35) {
                    System.out.println("Число в диапозоне [15 - 35]");
                } else if (chisloPolzovatelya >= 36 & chisloPolzovatelya <= 50) {
                    System.out.println("Число в диапозоне [36 - 50]");
                } else if (chisloPolzovatelya >= 50 & chisloPolzovatelya <= 100) {
                    System.out.println("Число в диапозоне [50 - 100]");
                } else {
                    System.out.println("\u001B[31m" + "Число: " + chisloPolzovatelya + " не входит в диапозон чисел от 0 до 100" + "\u001B[0m");
                }
            } catch (InputMismatchException r) {
                System.out.println("\u001B[31m" + "Введенные даные не являются целым числом!" + "\u001B[0m");
            }
            System.out.println("Попробуете снова? да/нет для выхода нажмите \" н \" :");
            if (scanZnach.next().equalsIgnoreCase("н")) break;
        }
        System.out.println("Конец программы");
        scanZnach.close();
    }
}

