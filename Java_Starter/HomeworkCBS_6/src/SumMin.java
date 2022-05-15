public class SumMin {
    public static void main(String[] args) {
        System.out.println("   Домашнее задание 6 \n   Задание 2 \n2.1. Дано два числа A и B (A<B) выведите сумму всех чисел, расположенных между данными числами на экран.");
        int a = 5;
        int b = 15;
        int sum = 0;
        for (int i = a + 1; i < b; i++) {
            sum += i;
        }
        System.out.println("Решение: A = " + a + ", B = " + b + ", сумма всех чисел между A и B = " + sum);

        System.out.println("\n2.2. Дано два числа A и B (A<B) выведите все нечетные значения, расположенные между данными числами.");
        System.out.print("Решение: A = " + a + ", B = " + b + ", все нечетные значения между A и B: ");
        for (int i = a + 1; i < b; i++) {
            if ((i & 1) != 0) System.out.print(i + ", ");
        }
        System.out.println();
    }
}
