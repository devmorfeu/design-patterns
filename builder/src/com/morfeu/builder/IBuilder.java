package com.morfeu.builder;

import com.morfeu.component.CarType;
import com.morfeu.component.Engine;
import com.morfeu.component.Transmission;

public interface IBuilder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
    void setColor(String color);
}
