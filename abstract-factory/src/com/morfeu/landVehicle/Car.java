package com.morfeu.landVehicle;

public class Car implements ILandVehicle{

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("INICIANDO TRAJETO");
    }

    @Override
    public void getCargo() {
        System.out.println("PASSAGEIROS OK");
    }
}
