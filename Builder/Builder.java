package Builder;

public abstract class Builder {

    public abstract void buildKeller();

    public abstract void buildKüche();

    public abstract void buildElektrik();

    public abstract void buildDach();

    public abstract void buildMaterial();

    public abstract Haus getResult();
}