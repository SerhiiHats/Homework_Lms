import models.Car;

public class Main {
    public static void main(String[] args) {
        Car reno = new Car();
        Car bmw = new Car(2021);
        Car hyundai = new Car(2020, "white");

        System.out.println("reno: " + reno);
        System.out.println("bmw: " + bmw);
        System.out.println("hyundai: " + hyundai);
    }

}
