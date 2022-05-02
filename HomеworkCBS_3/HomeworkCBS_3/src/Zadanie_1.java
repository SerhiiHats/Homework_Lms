class Zadanie_1 {
    public static void main(String[] args) {
        int x = 10, y = 12, z = 3;

        System.out.println("Домашнее задание 3");
        System.out.println("Задание 1");
        System.out.println("Имеется 3 переменные типа int x = 10, y = 12, и z = 3");
        System.out.println("Выполните и рассчитайте результат следующих операций для этих переменных:");

        x += y - x++ * z;
        System.out.println("1) x += y - x++ * z   равно= " + x); // x = 10 + (12 - 10 * 3) = - 8

        z = --x - y * 5;
        System.out.println("2) z = --x - y * 5   равно= " + z); // z = -9 - 12 * 5 = - 69

        y /= x + 5 % z;
        System.out.println("3) y /= x + 5 % z   равно= " + y); // y = 12 / (-9  + 5) = - 3

        z = x++ + y * 5;
        System.out.println("4) z = x++ + y * 5   равно= " + z); // z = -9  + (- 3 * 5) = - 24

        x = y - x++ * z;
        System.out.println("5) x = y - x++ * z   равно= " + x); // x = -3  - (- 8 * -24) = - 195
    }
}
