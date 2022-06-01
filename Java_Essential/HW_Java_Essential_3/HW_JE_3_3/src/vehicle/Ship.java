package vehicle;

public class Ship extends Vehicle {
    private int numberOfpas;
    private String portOfRegistry;

    public Ship(String coordinates, double price, int speed, int yearOfManufac, int numberOfpas, String portOfRegistry) {
        super(coordinates, price, speed, yearOfManufac);
        this.numberOfpas = numberOfpas;
        this.portOfRegistry = portOfRegistry;
    }

    @Override
    public void present() {
        super.present();
        System.out.println(", numberOfpas= " + numberOfpas + ", portOfRegistry= " + portOfRegistry);
    }
}
