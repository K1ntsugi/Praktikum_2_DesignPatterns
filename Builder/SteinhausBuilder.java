package Builder;

public class SteinhausBuilder extends Builder {
    private Haus product = new Haus();

    @Override
    public void buildMaterial() {
        product.setMaterial("Stein");

    }

    @Override
    public void buildKeller() {
        product.setKeller(true);
        System.out.println("Baue kleine Keller für Steinhaus");

    }

    @Override
    public void buildKüche() {
        product.setKüche(true);
        System.out.println("Baue Küche für Steinhaus");

    }

    @Override
    public void buildElektrik() {
        product.setElektrik(true);
        System.out.println("Baue Elektik für Steinhaus");

    }

    @Override
    public void buildDach() {
        product.setDach(true);
        System.out.println("Baue Dach für Steinhaus");

    }

    public Haus getResult() {
        return product;
    }

}
