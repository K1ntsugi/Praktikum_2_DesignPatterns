package Strategy;

import java.util.ArrayList;

public class TestClient {
    public static void main(String[] args) {
        Route a = new Route("Frankreich", 900, 128900);
        Route b = new Route("Schweiz", 500, 12803);
        ArrayList<Route> routes = new ArrayList<>();
        routes.add(a);
        routes.add(b);
        Navigation navi = new Navigation(routes);

    }
}
