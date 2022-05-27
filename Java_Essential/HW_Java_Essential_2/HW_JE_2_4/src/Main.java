import models.Car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("grey");
        Car car2 = new Car(1500, "red");
        Car car3 = new Car(140, 1550, "yellow");
        Car car4 = new Car(2021, 195, 1650, "pink");

        System.out.println("car1: " + car1);
        System.out.println("car2: " + car2);
        System.out.println("car3: " + car3);
        System.out.println("car4: " + car4);

    }
}
