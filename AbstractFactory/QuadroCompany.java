package AbstractFactory;

public class QuadroCompany extends QuadcopterFabrik {

    private String manufacturer = "QuadroCompany";

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
