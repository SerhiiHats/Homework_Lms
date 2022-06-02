package vehicle;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoVehicle {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Vehicle obj1 = new Саг("Odessa", 27500, 180, 2020);
        Vehicle obj2 = new Plane("Miamі", 1750500, 750, 2017, 5700, 150);
        Vehicle obj3 = new Ship("Hamburg", 1450000, 35, 1997, 245, "Chernomorsk");
        vehicles.addAll(Arrays.asList(obj1, obj2, obj3));

        for (Vehicle v : vehicles) {
            System.out.print(v.getClass() + " : ");
            v.present();
            System.out.println();
        }
    }
}
