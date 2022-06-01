package vehicle;

import java.awt.*;
import java.util.ArrayList;

public class Vehicle {
    private String coordinates;
    private double price;
    private int speed;
    private int yearOfManufac;

    public Vehicle() {
    }

    public Vehicle(String coordinates, double price, int speed, int yearOfManufac) {
        this.coordinates = coordinates;
        this.price = price;
        this.speed = speed;
        this.yearOfManufac = yearOfManufac;
    }


    public void present() {
        System.out.print("coordinates= " + coordinates + ", price= " + price + ", speed= " + speed +
                ", yearOfManufac= " + yearOfManufac);
    }

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Vehicle obj1 = new Саг("Odessa", 27500, 180, 2020);
        Vehicle obj2 = new Plane("Miamі", 1750500, 750, 2017, 5700, 150);
        Vehicle obj3 = new Ship("Hamburg", 1450000, 35, 1997, 245, "Chernomorsk");
        vehicles.add(obj1);
        vehicles.add(obj2);
        vehicles.add(obj3);
        for (Vehicle v : vehicles) {
            System.out.print(v.getClass() + " : ");
            v.present();
            System.out.println();
        }
    }
}
