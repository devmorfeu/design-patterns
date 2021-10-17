package com.morfeu;

import com.morfeu.vehicle.Bicycle;
import com.morfeu.vehicle.IVehicle;

public class BicycleTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Bicycle();
    }
}
