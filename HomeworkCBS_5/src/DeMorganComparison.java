public class DeMorganComparison {
    public static void main(String[] args) {
        System.out.println("   Домашнее задание 5 \n   Задание 6. Используя теорему Де Моргана, преобразуйте исходное выражение A | B, в эквивалентное выражение");
        boolean a = false;
        boolean b = true;
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("Исходное выражние: A | B = " + (a | b));
        System.out.println("Приобразованое выражение: A | B = !(!A & !B) = " + !(!a & !b));
    }
}
