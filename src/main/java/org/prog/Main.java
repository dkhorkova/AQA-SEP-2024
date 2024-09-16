package org.prog;

public class Main {

    /**
     * ########################################
     * ########################################
     * ########################################
     * #############car1#######################
     * ########################################
     * #############car2#######################
     * ########################################
     *
     * @param args
     */
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car carOfJosh = car1;
        BigCar bigCar = new BigCar();
        Truck truck = new Truck();

        car1.milage = 10;
        car2.milage = 20;
        bigCar.color = "purple";
        truck.color = "green";

        bigCar.milage = 30;
        truck.milage = 100;

        bigCar.turnLeft();
        bigCar.dragAnotherCar();

        truck.turnLeft();
        truck.dragAnotherCar();
        truck.evacCar();

        paintCar(carOfJosh, "yellow");
        paintCar(car2, "blue");


        System.out.println("car1 - " + car1.color);
        System.out.println("carOfJosh - " + carOfJosh.color);
        System.out.println("car2 - " + car2.color);
    }

    public static void paintCar(Car carToPaint, String carNewColor) {
        System.out.println("Painting car with milage " + carToPaint.milage);
        carToPaint.color = carNewColor;
    }

    public static void smth(int i){
        i = 1000;
    }
}
