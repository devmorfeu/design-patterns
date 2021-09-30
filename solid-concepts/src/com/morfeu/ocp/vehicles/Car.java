package com.morfeu.ocp.vehicles;

import com.morfeu.ocp.contract.VehicleCar;

public class Car implements VehicleCar {

    private String color;
    private String year;
    private double engine;
    private int seats;

    public Car(String color, String year, double engine, int seats) {
        configureVehicle(color, year, engine, seats);
    }

    @Override
    public void configureVehicle(String color, String year, double engine, int seats) {

        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;

        System.out.println("CRIANDO UM CARRO: " + color +" "+ year +" "+ engine +" "+ seats);

        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("LIGANDO OS MOTORES");
    }
}
