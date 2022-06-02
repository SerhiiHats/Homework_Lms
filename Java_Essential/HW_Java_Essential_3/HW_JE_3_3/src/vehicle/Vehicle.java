package vehicle;

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


}
