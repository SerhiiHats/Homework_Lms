import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        double operand1 = 5;
        double operand2 = 0;
        String sign;
        Scanner scanZnaca = new Scanner(System.in);
        while (true) {
            System.out.println("\u001B[32m" + "У нас есть число: " + operand1 + " и число: " + operand2 + "\u001B[0m");      // "\u001B[32m" зеленый цвет, "\u001B[0m" сброс установок цвета
            System.out.println("Введите арифметическую перацию которую необходимо произвести над числами:  + , - , * , / ");
            sign = scanZnaca.next();
            switch (sign) {
                case "+": {
                    System.out.println("\u001B[32m" + operand1 + " " + sign + " " + operand2 + " = " + (operand1 + operand2) + "\u001B[0m");
                    break;
                }
                case "-": {
                    System.out.println("\u001B[32m" + operand1 + " " + sign + " " + operand2 + " = " + (operand1 - operand2) + "\u001B[0m");
                    break;
                }
                case "*": {
                    System.out.println("\u001B[32m" + operand1 + " " + sign + " " + operand2 + " = " + (operand1 * operand2) + "\u001B[0m");
                    break;
                }
                case "/": {
                    if (operand2 == 0) {
                        System.out.println("\u001B[31m" + "На ноль делить нельзя, операция: " + operand1 + " " + sign + " " + operand2 + " - не имеет решения!" + "\u001B[0m" + "\u001B[0m");  // "\u001B[31m" красный цвет, "\u001B[0m" сброс установок цвета
                    } else {
                        System.out.println("\u001B[32m" + operand1 + " " + sign + " " + operand2 + " = " + (operand1 / operand2) + "\u001B[0m");
                    }
                    break;
                }
                default: {
                    System.out.println("\u001B[31m" + "Вы ввели неверный символ, доступно только :  + , - , * , / , попробуете еще раз?" + "\u001B[0m");
                    break;
                }
            }
            System.out.println("Do you want to continue? press any key to continue or \" q \" to exit!");
            if (scanZnaca.next().equals("q")) break;
        }
        System.out.println("End of program");
        scanZnaca.close();
    }
}
