package com.morfeu.director;

import com.morfeu.builder.IBuilder;
import com.morfeu.component.CarType;
import com.morfeu.component.Engine;
import com.morfeu.component.Transmission;

public class Director {

    public void constructorSedanCar(IBuilder builder) {
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
        builder.setColor("white");
    }

    public void constructorTruck(IBuilder builder) {
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(2);
        builder.setTransmission(Transmission.MANUAL);
        builder.setEngine(new Engine(2500));
        builder.setColor("yellow");
    }

    public void constructorSportCar(IBuilder builder) {
        builder.setCarType(CarType.SPORTCAR);
        builder.setSeats(2);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(5000));
        builder.setColor("black");
    }
}
