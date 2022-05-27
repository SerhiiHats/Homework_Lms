package models;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this(2012, 180, 1500, "blue");
    }
    public Car(String color) {
        this(2015, 155, 1350, color);
    }


    public Car(int weight, String color) {
        this(2017, 135, weight, color );
    }

    public Car(double speed, int weight, String color) {
        this(2019, speed, weight, color );
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
