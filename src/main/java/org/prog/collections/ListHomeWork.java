package org.prog.collections;
import org.prog.inheritance.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//TODO: Create list of 1000 cars
//TODO: Pain each car RANDOMLY in one for following colors: red, green, blue
//TODO: put cars in separate lists based on their colors
//TODO: print size of each list
public class ListHomeWork {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();


        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            cars.add(new Car());
        }
        for (int i = 0; i  < cars.size() ; i++) {
            cars.get(i).color = "red";
            cars.get(i).color = "green";
            cars.get(i).color = "blue";

            random.nextInt(3);

            System.out.println("Red Car: " +  i);
            System.out.println("Size of Red Cars List: " + i);

            System.out.println("Green Car: " + i);
            System.out.println("Size of Green Cars List: " +i );

            System.out.println("Blue Car: " + i);
            System.out.println("Size of Blue Cars List: " + i);

        }
    }


        }



