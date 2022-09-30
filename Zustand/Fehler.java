package Zustand;

public class Fehler implements State {
    @Override
    public State vorzeichenGelesen() {
        return null;
    }

    @Override
    public State zahlGelesen() {
        return null;
    }

    @Override
    public State eGelesen() {
        return null;
    }

    @Override
    public State kommaGelesen() {
        return null;
    }
}
