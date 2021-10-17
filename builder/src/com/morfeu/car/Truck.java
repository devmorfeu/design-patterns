package com.morfeu.car;

import com.morfeu.component.CarType;
import com.morfeu.component.Engine;
import com.morfeu.component.Transmission;

public class Truck {

    private final CarType carType;
    private final int seats;
    private final String color;
    private final Engine engine;
    private final Transmission transmission;

    public Truck(CarType carType, int seats, Engine engine, Transmission transmission, String color) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.color = color;
    }

    public String result(){
        return "Truck with motor: " + engine.getPower() + " Transmission: " + transmission + " color " + color;
    }
}