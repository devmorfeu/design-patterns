package com.morfeu.factory;

import com.morfeu.aircraft.Helicopter;
import com.morfeu.aircraft.IAircraft;
import com.morfeu.boat.Boat;
import com.morfeu.boat.IBoat;
import com.morfeu.landVehicle.ILandVehicle;
import com.morfeu.landVehicle.Motorcycle;

public class NineNineTransport implements ITransportFactory{

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}
