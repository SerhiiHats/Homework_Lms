public class LogicOperations {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 15;
        System.out.println("   Домашнее задание 5" + "\n   Задание 3:" + "\nИмеется 3 переменные типа int x = 5, y = 10, и z = 15; Выполните и рассчитайте результат следующих операций для этих переменных:");
        System.out.println("1. Выражение: x += y >> x++ * z равняется: " + (x += y >> x++ * z));
        System.out.println("2. Выражение: z = ++x & y * 5 равняется: " + (z = ++x & y * 5));
        System.out.println("3. Выражение: y /= x + 5 | z равняется: " + (y /= x + 5 | z));
        System.out.println("4. Выражение: z = x++ & y * 5 равняется: " + (z = x++ & y * 5));
        System.out.println("5. Выражение: x = y << x++ ^ z равняется: " + (x = y << x++ ^ z));
    }
}
