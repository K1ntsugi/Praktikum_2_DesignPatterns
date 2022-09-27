package AbstractFactory;

public class Regulator {

    private String manufacturer;

    public Regulator(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

}
