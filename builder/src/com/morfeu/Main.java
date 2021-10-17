package com.morfeu;

import com.morfeu.builder.CarBuilder;
import com.morfeu.builder.SportCarBuilder;
import com.morfeu.builder.TruckBuilder;
import com.morfeu.car.Car;
import com.morfeu.car.Truck;
import com.morfeu.director.Director;

public class Main {

    public static void main(String[] args) {

        var director = new Director();
        var carBuilder = new CarBuilder();
        var truckBuilder = new TruckBuilder();
        var sportCarBuilder = new SportCarBuilder();


        director.constructorSedanCar(carBuilder);
        var car = carBuilder.getResult();
        System.out.println("Carro Popular: " + car.result());

        director.constructorTruck(truckBuilder);
        var truck = truckBuilder.getResult();
        System.out.println("Caminhao: " + truck.result());

        director.constructorSportCar(sportCarBuilder);
        var sportCar = sportCarBuilder.getResult();
        System.out.println("Carro Esportivo: " + sportCar.result());


    }
}
