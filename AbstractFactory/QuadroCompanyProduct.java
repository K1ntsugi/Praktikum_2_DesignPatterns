package AbstractFactory;

public class QuadroCompanyProduct extends Quadrocopter {

    Engine productA;
    Regulator productB;

    public QuadroCompanyProduct(Regulator regulator, Engine engine) {
        super(regulator, engine);
        if (regulator.getManufacturer().equals(engine.getManufacturer())) {
            return;
        }
        System.out.println("Die Teile passen nicht zusammen");
    }

    @Override
    public Quadrocopter createQuadrocopter() {
        return new QuadroCompanyProduct(productB, productA);
    }

}
