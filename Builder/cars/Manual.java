package Builder.cars;

import Builder.components.Engine;
import Builder.components.GPSNavigator;
import Builder.components.Transmission;
import Builder.components.TripComputer;


public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Tipo do carro: " + carType + "\n";
        info += "Número de lugares: " + seats + "\n";
        info += "Motor: volume - " + engine.getVolume() + "; quilometragem - " + engine.getMileage() + "\n";
        info += "Transmissão: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Comutador de bordo: Funcional" + "\n";
        } else {
            info += "Computador de bordo: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS: Funcional" + "\n";
        } else {
            info += "GPS: N/A" + "\n";
        }
        return info;
    }
}
