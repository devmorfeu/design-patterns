package com.morfeu.factory;

import com.morfeu.aircraft.Airplane;
import com.morfeu.aircraft.IAircraft;
import com.morfeu.boat.Boat;
import com.morfeu.boat.IBoat;
import com.morfeu.landVehicle.Car;
import com.morfeu.landVehicle.ILandVehicle;

public class BoatTransport implements ITransportFactory{

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}