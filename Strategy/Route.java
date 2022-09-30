package Strategy;

public class Route {
    private String name;
    private int timeInMinutes;
    private double distanceInMeter;

    public Route(String name, int timeInMinutes, double distanceInMeter) {
        this.name = name;
        this.timeInMinutes = timeInMinutes;
        this.distanceInMeter = distanceInMeter;
    }
}
