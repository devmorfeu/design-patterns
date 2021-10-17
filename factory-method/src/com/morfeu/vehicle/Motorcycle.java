package com.morfeu.vehicle;

public class Motorcycle implements IVehicle{

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("INICIANDO A ENTREGA");
    }

    @Override
    public void getCargo() {
        System.out.println("PEGAMOS A ENCOMENDA!");
    }
}