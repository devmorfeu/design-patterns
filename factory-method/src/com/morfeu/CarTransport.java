package com.morfeu;

import com.morfeu.vehicle.Car;
import com.morfeu.vehicle.IVehicle;

public class CarTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
