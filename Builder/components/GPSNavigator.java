package Builder.components;


public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "Contagem, Alvorada, Rua Henrique Pascal, 442";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
