package com.morfeu.isp.vehicles;

import com.morfeu.isp.contract.IVehicle;
import com.morfeu.isp.contract.IVehicleMotorcycle;

public class Motorcycle implements IVehicle, IVehicleMotorcycle {

    private String color;
    private String year;
    private double engine;

    public Motorcycle(String color, String year, double engine) {
        configureMotorcycle(color, year, engine);
    }

    @Override
    public void configureMotorcycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;

        System.out.println("CRIANDO UMA MOTO: "+ engine + " " + color + " " + year);
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("LIGANDO MOTORES");
    }
}
