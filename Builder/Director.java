package Builder;

public class Director {
    private Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildMaterial();
        builder.buildKeller();
        builder.buildKüche();
        builder.buildElektrik();
        builder.buildDach();

    }
}