package Builder;

import Builder.builders.CarBuilder;
import Builder.builders.CarManualBuilder;
import Builder.cars.Car;
import Builder.cars.Manual;
import Builder.director.Director;

/**
 * A classe principal para resolução de todos os
 * processos de montagem do carro.
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("Carro construído:\n" + car.getCarType());
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nEspecificações do carro construído:\n" + carManual.print());
    }

}
