package com.morfeu.landVehicle;

public class Motorcycle implements ILandVehicle{

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("INICIANDO TRAJETO");
    }

    @Override
    public void getCargo() {
        System.out.println("ENCOMENDA OK");
    }
}
