package employees;

public class Address {
    private String index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

    @Override
    public String toString() {
        return "Address{" +
                "index='" + index + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                ", apartment=" + apartment +
                '}';
    }

    public void setIndex(String index) {
        this.index = index;
    }
    public String getIndex() {
        return index;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return country;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public String getStreet(){
        return street;
    }
    public void setHouse(int house){
        this.house = house;
    }
    public int getHouse(){
        return house;
    }
    public void setApartment(int apartment){
        this.apartment = apartment;
    }
    public int getApartment(){
        return apartment;
    }

}
