package com.morfeu.boat;

public class Boat implements IBoat {

    @Override
    public void startRoute() {
        getCargo();
        sea();
        System.out.println("INICIANDO NAVEGAÇÃO");
    }

    @Override
    public void getCargo() {
        System.out.println("PASSAGEIROS OK!");
    }

    @Override
    public void sea() {
        System.out.println("ONDAS DO MAR OK!");
    }
}
