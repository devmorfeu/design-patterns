package com.morfeu.app;

import com.morfeu.aircraft.IAircraft;
import com.morfeu.boat.IBoat;
import com.morfeu.factory.ITransportFactory;
import com.morfeu.landVehicle.ILandVehicle;

public class Application {

    private ILandVehicle vehicle;
    private IAircraft aircraft;
    private IBoat boat;

    public Application(ITransportFactory transportFactory){
        vehicle = transportFactory.createTransportVehicle();
        aircraft = transportFactory.createTransportAircraft();
        boat = transportFactory.createTransportBoat();
    }

    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
        boat.startRoute();
    }
}
