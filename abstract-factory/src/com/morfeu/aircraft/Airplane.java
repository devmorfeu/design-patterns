package com.morfeu.aircraft;

public class Airplane implements IAircraft{

    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("INICIANDO A DECOLAGEM");
    }

    @Override
    public void getCargo() {
        System.out.println("PASSAGEIROS A BORDO");
    }

    @Override
    public void wind() {
        System.out.println("VENTOS A 25KM, VENTOS OK!");
    }
}
