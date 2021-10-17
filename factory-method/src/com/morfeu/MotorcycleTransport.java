package com.morfeu;

import com.morfeu.vehicle.IVehicle;
import com.morfeu.vehicle.Motorcycle;

public class MotorcycleTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
