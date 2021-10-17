package com.morfeu.aircraft;

public class Helicopter implements IAircraft{

    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("INICIANDO A DECOLAGEM");
    }

    @Override
    public void getCargo() {
        System.out.println("PASSAGEIROS A BORDO, LIGANDO HÉLICES");
    }

    @Override
    public void wind() {
        System.out.println("VENTOS A 25KM, VENTOS OK!");
    }
}
