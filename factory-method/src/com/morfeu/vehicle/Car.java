package com.morfeu.vehicle;

public class Car implements IVehicle{

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("INICIANDO O TRAJETO");
    }

    @Override
    public void getCargo() {
        System.out.println("PEGAMOS OS PASSAGEIROS, ESTAMOS PRONTOS!");
    }
}
