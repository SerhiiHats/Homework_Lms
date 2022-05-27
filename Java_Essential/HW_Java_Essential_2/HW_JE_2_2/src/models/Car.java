package models;

public class Car {
    private int year;
    private String color;

    public Car(){
        this.year = 2019;
        this.color = "white";
    }

    public Car(int year) {
        this.year = year;
        this.color = "red";
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
