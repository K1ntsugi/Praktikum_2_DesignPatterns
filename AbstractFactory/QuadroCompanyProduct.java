package AbstractFactory;

public class QuadroCompanyProduct extends Quadrocopter {

    public QuadroCompanyProduct(Regulator regulator, Engine engine) {
        super(regulator, engine);
        if (regulator.getManufacturer().equals(engine.getManufacturer())) {
            return;
        }
        System.out.println("Die Teile passen nicht zusammen");
    }

    @Override
    public Quadrocopter createQuadrocopter() {
        return new QuadroCompanyProduct(regulator, productA);
    }

}
