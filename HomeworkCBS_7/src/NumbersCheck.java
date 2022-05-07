import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NumbersCheck {
    static void stadynumber(double myNum) {
        int shetchikProstoeNumber = 0;
        if (myNum == (int) myNum) {
            System.out.println(myNum + " : это целое число");
        } else {
            System.out.println(myNum + " : это вещественное число");
        }

        if (myNum != 0) {
            if (myNum < 0) {
                System.out.println(myNum + " : это отрицательное число");
                System.out.println(myNum + " : это непростое число");
            } else {
                System.out.println(myNum + " : это положительное число");
                if (myNum == (int) myNum && myNum != 0 && myNum != 1) {
                    for (int i = 2; i < myNum - 1; i++) {
                        if (myNum % i == 0) {
                            shetchikProstoeNumber++;
                        }
                    }

                    if (shetchikProstoeNumber == 0) {
                        System.out.println(myNum + " : это простое число (делится только на " + myNum + " и на 1)");
                    } else {
                        System.out.println(myNum + " : это непростое число");
                    }

                } else {
                    System.out.println(myNum + " : это непростое число");
                }
            }

            if (myNum % 2 == 0 && myNum % 5 == 0 && myNum % 3 == 0 && myNum % 6 == 0 && myNum % 9 == 0) {
                System.out.println(myNum + " : делится ли на 2, 5, 3, 6, 9 без остатка");
            } else {
                System.out.println(myNum + " : не делится ли на 2, 5, 3, 6, 9 без остатка");
            }

        } else {
            System.out.println(myNum + " : Ноль! не является ни положительным, ни отрицательным числом!");
            System.out.println(myNum + " : Ноль! это непростое число!");
            System.out.println(myNum + " : Ноль! делится ли на 2, 5, 3, 6, 9 без остатка!");
        }
    }


    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("Введите число и мы определим его свойства:");
            BufferedReader myRead = new BufferedReader(new InputStreamReader(System.in));
            double myNumber = Double.parseDouble(myRead.readLine());
            Scanner sc = new Scanner(System.in);
            stadynumber(myNumber);
            System.out.println("Продолжим Да / Нет ? для выхода нажмите \" 0 \" :");
            if (sc.next().equalsIgnoreCase("0")) {
                break;
            }
        }
        System.out.println("Конец программы");
    }

}
