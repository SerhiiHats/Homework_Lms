import java.util.Scanner;

public class Arithmetics {
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
            System.out.println("Операция деления: " + operand1 + " / " + operand2 + " = " + (operand1 / (double)operand2));
        } else {
            System.out.println("Деление на ноль! Операция не имеет решения");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean kluchVichoda = true;
        do {
            System.out.println("Арифметические операции над переменными А и В");
            System.out.println("Введите с клавиатуры переменную А :");
            int a1 = scanner.nextInt();
            System.out.println("Введите с клавиатуры переменную B :");
            int a2 = scanner.nextInt();
            while (kluchVichoda) {
                System.out.println("Вы ввели: " + a1 + " и " + a2 + " выбирете одну из операций: ( + - * / ), для выхода - любой другой символ:");
                String arithmOperaziya = scanner.next();
                switch (arithmOperaziya) {
                    case "+": {
                        Arithmetics.add(a1, a2);
                        break;
                    }
                    case "-": {
                        Arithmetics.sub(a1, a2);
                        break;
                    }
                    case "*": {
                        Arithmetics.mul(a1, a2);
                        break;
                    }
                    case "/": {
                        Arithmetics.div(a1, a2);
                        break;
                    }
                    default: {
                        kluchVichoda = false;
                    }
                }

            }
            System.out.println("Вы хотите продолжить с другими переменными: Да - любой символ / Нет - \" q \":");
            String kluch1 = scanner.next();
            if (kluch1.equalsIgnoreCase("q")) {
                kluchVichoda = false;
            } else {
                kluchVichoda = true;
            }
        } while (kluchVichoda);
        System.out.println("Конец программы");
        scanner.close();
    }
}
