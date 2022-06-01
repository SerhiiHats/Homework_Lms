package vehicle;

public class Plane extends Vehicle{
    private int heigth;
    private int numberOfpas;

    public Plane(String coordinates, double price, int speed, int yearOfManufac, int heigth, int numberOfpas) {
        super(coordinates, price, speed, yearOfManufac);
        this.heigth = heigth;
        this.numberOfpas = numberOfpas;
    }

    @Override
    public void present() {
        super.present();
        System.out.print(", heigth= " + heigth + ", numberOfpas= " + numberOfpas);
    }
}
