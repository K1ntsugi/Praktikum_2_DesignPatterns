package AbstractFactory;

public class Engine {

    private String manufacturer;

    public Engine(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

}
