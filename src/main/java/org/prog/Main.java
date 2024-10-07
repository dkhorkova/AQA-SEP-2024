package org.prog;

import org.prog.inheritance.*;
import org.prog.poly.ICar;

public class Main {

    public static void main(String[] args) {
//        Ford ford = new Ford();
//        Toyota toyota = new Toyota();
//        BMW bmw = new BMW();
//
//        ford.honk();
//
//        driveCar(ford);
//        driveCar(toyota);
//        driveCar(bmw);

        System.out.println("=======================================");

        DemoCar demoCar = new DemoCar("a");
//        Truck truck = new Truck();
//        BigTruck bigTruck = new BigTruck();
//        RoadTrain roadTrain = new RoadTrain();
//        BigRoadTrain bigRoadTrain = new BigRoadTrain();
        demoCar.turnLeft();
//        truck.turnLeft();
//        bigTruck.turnLeft();
//        roadTrain.turnLeft();
//        bigRoadTrain.turnLeft();



        demoCar.goTo("Kyiv");
        demoCar.goTo("Kyiv", "Odessa");
        demoCar.goTo("Kyiv", "Odessa", "Dnipro");
        demoCar.goTo("Kyiv", "Odessa", "Dnipro", "My cats");
    }

    public static void driveCar(ICar iCar) {
        iCar.driveForward();
        iCar.turn("Left");
        iCar.driveForward();
        iCar.turn("Right");
        iCar.driveForward();
    }
}
