package com.morfeu.isp;

import com.morfeu.isp.vehicles.Car;
import com.morfeu.isp.vehicles.Motorcycle;

public class MainISP {

    public static void main(String[] args) {

        var type = "car";

        if (type == "moto") {
            new Car("preto", "2020", 2.0, 4);
        } else {
            new Motorcycle("branca", "2019", 250);
        }
    }
}
