import employees.Address;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Address adress = new Address();
        System.out.println("Введите index (String) :");
        adress.setIndex(scanner.next());
        scanner.nextLine();
        System.out.println("Введите country (String) :");
        adress.setCountry(scanner.nextLine());
        System.out.println("Введите city (String) :");
        adress.setCity(scanner.nextLine());
        System.out.println("Введите street (String) :");
        adress.setStreet(scanner.nextLine());
        System.out.println("Введите house (int) :");
        adress.setHouse(scanner.nextInt());
        System.out.println("Введите apartment (int) :");
        adress.setApartment(scanner.nextInt());
        System.out.println("1. Вывод в концоль созданого обекта:");
        System.out.println("индекс: " + adress.getIndex() + ", страна: " + adress.getCountry() + ", город: " + adress.getCity() + ", улица: " + adress.getStreet() + ", номер дома: " + adress.getHouse() + ", номер квартиры: " + adress.getApartment());
        System.out.println();
        System.out.println("2. Другой вариант вывода в консоль обьекта через переопределенный метот обекта toString:");
        System.out.println(adress);
    }
}
