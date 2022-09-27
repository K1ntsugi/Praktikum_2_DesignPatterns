package AbstractFactory;

public abstract class Quadrocopter {

    private String manufacturer;
    private int serialNumber = 99;
    private Engine productA;
    private Regulator productB;

    public Quadrocopter(Regulator regulator, Engine engine) {
        this.serialNumber++;
        this.manufacturer = manufacturer;
        regulator = productB;
        engine = productA;
    }

    public abstract Quadrocopter createQuadrocopter();

}
