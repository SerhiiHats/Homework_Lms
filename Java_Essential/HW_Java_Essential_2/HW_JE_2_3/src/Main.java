import models.Car;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        Car bmw = new Car(2017);
        Car akura = new Car(2015, 180);
        Car honda = new Car(2020, 175, 1500);
        Car mercedes = new Car(2018, 220, 1750, "black");

        System.out.println("audi: " + audi);
        System.out.println("bmw: " + bmw);
        System.out.println("akura: " + akura);
        System.out.println("honda: " + honda);
        System.out.println("mercedes: " + mercedes);
    }
}
