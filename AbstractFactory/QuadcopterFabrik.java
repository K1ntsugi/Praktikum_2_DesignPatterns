package AbstractFactory;

public abstract class QuadcopterFabrik {
    public abstract Engine createEngine();

    public abstract Regulator createRegulator();
}
