package com.morfeu.car;

import com.morfeu.component.CarType;
import com.morfeu.component.Engine;
import com.morfeu.component.Transmission;

public class SportCar {

    private final CarType carType;
    private final int seats;
    private final String color;
    private final Engine engine;
    private final Transmission transmission;

    public SportCar(CarType carType, int seats,String color, Engine engine, Transmission transmission) {
        this.carType = carType;
        this.seats = seats;
        this.color = color;
        this.engine = engine;
        this.transmission = transmission;
    }

    public String result(){
        return "SportCar with motor: " + engine.getPower() + " Transmission: " + transmission + " " + "color: " + color;
    }
}
