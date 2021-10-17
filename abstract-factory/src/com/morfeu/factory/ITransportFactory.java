package com.morfeu.factory;

import com.morfeu.aircraft.IAircraft;
import com.morfeu.boat.IBoat;
import com.morfeu.landVehicle.ILandVehicle;

public interface ITransportFactory {

    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
    IBoat createTransportBoat();
}
