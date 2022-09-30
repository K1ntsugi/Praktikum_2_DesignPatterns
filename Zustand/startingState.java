package Zustand;

public class startingState implements State{
    @Override
    public State vorzeichenGelesen() {
        return new VorzeichenErkannt();
    }

    @Override
    public State zahlGelesen() {
        return new ZahlErkannt();
    }

    @Override
    public State eGelesen() {
        return new Fehler();
    }

    @Override
    public State kommaGelesen() {
        return new Fehler();
    }
}
