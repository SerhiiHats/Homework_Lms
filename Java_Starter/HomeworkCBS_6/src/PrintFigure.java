import java.util.Scanner;

public class PrintFigure {
    public static void main(String[] args) {
        boolean kluchVichoda = true;
        Scanner scanChicloViboraFiguru = new Scanner(System.in);
        System.out.println("   Домашнее задание 6 \n   Задание 3 \nИспользуя циклы и метод System.out.print(\"*\") вывести на экран:");
        while (kluchVichoda) {
            System.out.println("\u001B[1;32m" + "***************** Выбирите следующую фигуру *****************" + "\u001B[0m");
            System.out.println("\u001B[1;32m" + "1." + "\u001B[0m" + " прямоугольник. " + "\u001B[1;32m" + "2." + "\u001B[0m" + " прямоугольный треугольник. " + "\u001B[1;32m" + "3." + "\u001B[0m" + " равносторонний треугольник. " + "\u001B[1;32m" + "4." + "\u001B[0m" + " ромб.");
            System.out.println("Введите номер соответствующей фигуры " + "\u001B[1;32m" + "(1, 2, 3, 4) " + "\u001B[0m" + "/ или любой другой символ для выхода:");
            switch (scanChicloViboraFiguru.next()) {
                case "1": {
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 14; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                }
                case "2": {
                    int t = 0;
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j <= i + t; j++) {
                            System.out.print("*");
                        }
                        t++;
                        System.out.print("\n");
                    }
                    break;
                }
                case "3": {
                    int k = 15 / 2;
                    int n = 0;
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 15; j++) {
                            if (j >= k - n & j <= k + n) System.out.print("*");
                            else System.out.print(" ");
                        }
                        n++;
                        System.out.print("\n");
                    }
                    break;
                }
                case "4": {
                    int zentrDiagonalRomba = 15 / 2;
                    int stepOtZentrDiagonal = 0;
                    int reversAndLengthStep = 2;
                    for (int z = 0; z < 2; z++) {
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 15; j++) {
                                if (j >= zentrDiagonalRomba - stepOtZentrDiagonal & j <= zentrDiagonalRomba + stepOtZentrDiagonal)
                                    System.out.print("*");
                                else System.out.print(" ");
                            }
                            stepOtZentrDiagonal = stepOtZentrDiagonal + reversAndLengthStep;
                            System.out.print("\n");
                        }
                        if (z == 0) {
                            for (int j = 0; j < 15; j++)
                                System.out.print("*");
                            System.out.print("\n");
                        }
                        reversAndLengthStep = -2;
                        stepOtZentrDiagonal = stepOtZentrDiagonal + reversAndLengthStep;
                    }
                    break;
                }
                default: {
                    System.out.println("Конец программы");
                    kluchVichoda = false;

                }
            }
        }
    }
}
