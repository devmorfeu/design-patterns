package com.morfeu.car;

import com.morfeu.component.CarType;
import com.morfeu.component.Engine;
import com.morfeu.component.Transmission;

public class Car {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final String color;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, String color) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.color = color;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public String getColor() {
        return color;
    }

    public String result(){
        return "Sedan with motor: " + engine.getPower() + " Transmission: " + transmission + " " + "color: " + color;
    }
}
