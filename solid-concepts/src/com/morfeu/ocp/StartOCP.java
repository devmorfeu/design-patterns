package com.morfeu.ocp;

import com.morfeu.ocp.vehicles.Car;
import com.morfeu.ocp.vehicles.Motorcycle;
import com.morfeu.ocp.vehicles.TypeVehicle;

/**
 *      OPEN/CLOSED PRINCIPLE
 * "aberto para extensão e fechado para modificação"
 *
 * Ou seja, as entidades de software como classes, módulos, funções,
 * etc, devem estar abertas para extensão, porém fechadas para modificação.
 */
public class StartOCP {

    public static void main(String[] args) {

        var typeVehicle = TypeVehicle.MOTORCYCLE;

        if (typeVehicle == TypeVehicle.CAR) {
            new Car("preto", "2021", 2.0, 4);
        } else {
            new Motorcycle("azul", "2021", 250);
        }
    }
}
