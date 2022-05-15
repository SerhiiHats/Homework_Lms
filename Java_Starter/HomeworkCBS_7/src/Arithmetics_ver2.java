import java.util.Scanner;

public class Arithmetics_ver2 {
    static void add(int operand1, int operand2) {
        System.out.println("Операция сложения: " + operand1 + " + " + operand2 + " = " + (operand1 + operand2));
    }

    static void sub(int operand1, int operand2) {
        System.out.println("Операция вычитания: " + operand1 + " - " + operand2 + " = " + (operand1 - operand2));
    }

    static void mul(int operand1, int operand2) {
        System.out.println("Операция умножения: " + operand1 + " * " + operand2 + " = " + (operand1 * operand2));
    }

    static void div(int operand1, int operand2) {
        if (operand2 != 0) {
            System.out.println("Операция деления: " + operand1 + " / " + operand2 + " = " + (operand1 / (double) operand2));
        } else {
            System.out.println("Деление на ноль! Операция не имеет решения");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int chetchikArifmSimvol = 0;
            char arifmetSimvolchar = ' ';
            int operand1;
            int operand2;

            System.out.println("Арифметические операции над переменными А и В");
            System.out.println("Введите с клавиатуры в строчку две переменные и оператор между ними (по примеру 2+5):");
            String prinyatayaStroka = scanner.nextLine();
            String strZifr = prinyatayaStroka.trim();
            StringBuilder bild1 = new StringBuilder();
            StringBuilder bild2 = new StringBuilder();

            for (int i = 0; i < strZifr.length(); i++) {
                if (chetchikArifmSimvol == 0 && strZifr.charAt(i) != ' ' && strZifr.charAt(i) != '+' && strZifr.charAt(i) != '-' && strZifr.charAt(i) != '*' && strZifr.charAt(i) != '/') {
                    bild1.append(strZifr.charAt(i));
                }
                if (chetchikArifmSimvol == 1 && strZifr.charAt(i) != ' ' && strZifr.charAt(i) != '+' && strZifr.charAt(i) != '-' && strZifr.charAt(i) != '*' && strZifr.charAt(i) != '/') {
                    bild2.append(strZifr.charAt(i));
                }
                if (strZifr.charAt(i) == '+' || strZifr.charAt(i) == '-' || strZifr.charAt(i) == '*' || strZifr.charAt(i) == '/') {
                    arifmetSimvolchar = strZifr.charAt(i);
                    chetchikArifmSimvol++;
                }
            }
            if (chetchikArifmSimvol != 1) {
                System.out.println("Было ведено некоректное выражение1");
                return;
            }
            operand1 = Integer.parseInt(bild1.toString());
            operand2 = Integer.parseInt(bild2.toString());
            switch (arifmetSimvolchar) {
                case '+': {
                    Arithmetics.add(operand1, operand2);
                    break;
                }
                case '-': {
                    Arithmetics.sub(operand1, operand2);
                    break;
                }
                case '*': {
                    Arithmetics.mul(operand1, operand2);
                    break;
                }
                case '/': {
                    Arithmetics.div(operand1, operand2);
                    break;
                }
                default: {
                    System.out.println("Было ведено некоректное выражение2");
                }
            }

            System.out.println("Вы хотите продолжить с другими переменными: " + "\u001B[1;32m" + "Да - любой символ / Нет - \" 0 \":" + "\u001B[0m");
            if (scanner.next().equals("0")) {
                break;
            } else {
                scanner.nextLine();
                //System.out.println();
            }
        }

        System.out.println("Конец программы");
        scanner.close();
    }
}
