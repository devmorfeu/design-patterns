package com.morfeu;

import com.morfeu.vehicle.IVehicle;

public abstract class Transport {

    void startTransport(){
        var vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
