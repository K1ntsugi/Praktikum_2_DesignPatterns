package AbstractFactory;

public class FlyCompany extends QuadcopterFabrik {

    private String manufacturer = "FlyCompany";

    @Override
    public Engine createEngine() {
        Engine productA = new Engine(manufacturer);
        return productA;
    }

    @Override
    public Regulator createRegulator() {
        Regulator productB = new Regulator(manufacturer);
        return productB;
    }

}
