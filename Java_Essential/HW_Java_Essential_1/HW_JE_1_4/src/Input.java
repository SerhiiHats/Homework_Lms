import hardware.Computer;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computer[] masComp = new Computer[5];
        for (int i = 0; i < 5; i++) {
            Computer objComp = new Computer();
            System.out.println("Введите название компютера");
            objComp.setName(scanner.nextLine());
            System.out.println("Введите частоту процессора");
            objComp.setСpu(scanner.nextInt());
            masComp[i] = objComp;
            scanner.nextLine();
        }
        System.out.println("Демонстрация введенных компютеров:");
        for (int i = 0; i < masComp.length; i++) {
            System.out.println(masComp[i]);
        }
        System.out.println("Вывести название компютера по индексу записи (начало -0, конец -4) введите номер записи:");
        System.out.println(masComp[scanner.nextInt()].getName());
        System.out.println("конец программы");
        scanner.close();
    }

}
