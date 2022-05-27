package models;

public class MyArea {
    public static final double PI = 3.14;
    public static void areOfCircle(double radius){
        System.out.println("Площадь круга с радиусом: " + radius + " равна: " + (PI * Math.pow(radius, 2)));
    }
}
