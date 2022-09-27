package Builder;

public class HolzhausBuilder extends Builder {

    private Haus product = new Haus();

    @Override
    public void buildMaterial() {
        product.setMaterial("Holz");

    }

    @Override
    public void buildKeller() {
        product.setKeller(true);
        System.out.println("Baue kleine Keller für Holzhaus");

    }

    @Override
    public void buildKüche() {
        product.setKüche(true);
        System.out.println("Baue Küche für Holzhaus");

    }

    @Override
    public void buildElektrik() {
        product.setElektrik(true);
        System.out.println("Baue Elektik für Holzhaus");

    }

    @Override
    public void buildDach() {
        product.setDach(true);
        System.out.println("Baue Dach für Holzhaus");

    }

    public Haus getResult() {
        return product;
    }

}
