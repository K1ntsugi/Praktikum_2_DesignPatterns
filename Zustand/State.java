package Zustand;

public interface State {
    public State vorzeichenGelesen();
    public State zahlGelesen();
    public State eGelesen();
    public State kommaGelesen();
}
