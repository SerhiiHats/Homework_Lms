class Circle {
    public static void main(String[] args) {
        final double PI = 3.141592653589793;
        double ploshaKryga, radiysKryga = 6;

        System.out.println((char) 27 + "[32m" + "Домашнее задание 3");
        System.out.println("Задание 3");
        System.out.println("Используя формулу πR2 , вычислите площадь круга и выведите результат на экран");

        ploshaKryga = PI * Math.pow(radiysKryga, 2);
        System.out.println((char) 27 + "[33m" + "****************** Результат ***************");
        System.out.println((char) 27 + "[31m" + "Пощадь круга с радиусом: " + radiysKryga + ", равна: " + ploshaKryga);
    }
}
