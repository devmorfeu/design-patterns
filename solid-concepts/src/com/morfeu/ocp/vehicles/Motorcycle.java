package com.morfeu.ocp.vehicles;

import com.morfeu.ocp.contract.VehicleMotorcycle;

public class Motorcycle implements VehicleMotorcycle {

    private String color;
    private String year;
    private double engine;

    public Motorcycle(String color, String year, double engine) {
        configureVehicle(color, year, engine);
    }

    @Override
    public void configureVehicle(String color, String year, double engine) {

        this.color = color;
        this.year = year;
        this.engine = engine;

        System.out.println("CRIANDO UMA MOTO: " + color +" "+ year +" "+ engine);

        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("LIGANDO OS MOTORES");
    }
}