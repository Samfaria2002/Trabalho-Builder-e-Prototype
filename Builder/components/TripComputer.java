package Builder.components;

import Builder.cars.Car;


public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Nível do combustível: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Deu a partida.");
        } else {
            System.out.println("Não deu a partida.");
        }
    }
}
