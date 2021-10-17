package com.morfeu.vehicle;

public class Bicycle implements IVehicle{

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("INICIADO A ENTREGA DA COMIDA");
    }

    @Override
    public void getCargo() {
        System.out.println("PEGAMOS A COMIDA");
    }
}
