package com.morfeu.builder;

import com.morfeu.car.Truck;
import com.morfeu.component.CarType;
import com.morfeu.component.Engine;
import com.morfeu.component.Transmission;

public class TruckBuilder implements IBuilder{

    private CarType carType;
    private int seats;
    private String color;
    private Engine engine;
    private Transmission transmission;

    @Override
    public void setCarType(CarType carType) {this.carType = carType;}

    @Override
    public void setSeats(int seats) {this.seats = seats;}

    @Override
    public void setTransmission(Transmission transmission) {this.transmission = transmission;}

    @Override
    public void setEngine(Engine engine) {this.engine = engine;}

    @Override
    public void setColor(String color) {this.color = color;}

    public Truck getResult() {
        return new Truck(carType, seats, engine, transmission, color);
    }
}