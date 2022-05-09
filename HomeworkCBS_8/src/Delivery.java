import java.util.Scanner;

public class Delivery {
    static long kolmarshrutov(int n) {
        long kolichestvoMarchrutov;
        if (n == 1)
            return 1;
        kolichestvoMarchrutov = (kolmarshrutov(n - 1) * n);
        return kolichestvoMarchrutov;


    }
/* Обьяснение к задаче по поводу использования рекурсии:
мое интуитивное мнение такое, что этот метод плохой для вычисления
т.к. он значительно медленее работает чем итерационный метод,
также он забивает память компьтера, так как необходимо помнить
одновременно все значения вычеслений рекурсии, т.е. он ресурсозатратный кроме этого
метод рекурсии плох тем он трудно понятный для восприятия
чем вычисление в простых итерационных циклах которые к тому же и быстрей и проще для понимания кода человеком
 */

    public static void main(String[] args) {
        int kolichKlientov = -1;                       // условие входа в цикл
        Scanner scanKolichKlientov = new Scanner(System.in);
        System.out.println("Расчитаем сколько существует возможных вариантов маршрутов доставки товара, нашим клиентам одной машиной");
        while (kolichKlientov <= 0) {
            System.out.println("Введите N - количество клиентов:");
            if (scanKolichKlientov.hasNextInt()) {
                kolichKlientov = scanKolichKlientov.nextInt();
            } else {
                System.out.println("Неверно введено количество, можно только целое число");
                scanKolichKlientov.nextLine();
                continue;
            }
            if (kolichKlientov <= 0) {
                System.out.println("Неверно введено количество, клиентов для доставки не может быть: 0 или отрицательное число");
                scanKolichKlientov.nextLine();
            }
        }
        scanKolichKlientov.close();
        long kolichVariantovDostavki = kolmarshrutov(kolichKlientov);
        System.out.println("Для        : " + kolichKlientov + " клиентов \nсуществует : " + kolichVariantovDostavki + " вариантов доставки товара");
    }
}
