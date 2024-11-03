package org.prog.collections;
import org.prog.inheritance.Car;

import java.util.*;
import java.util.Set;
//TODO: create Map which will allow you to track car owners and cars they own
//TODO: At least one car must be owned by two owners
//TODO: print owners that share cars
public class MapsHomework {

    public static void main(String[] args) {

        Car sharedCar = new Car ();
        Set <Car> aleksCar = new HashSet<>();
        Set <Car> alicjaCar = new HashSet<>();
        CarOwner aleks = createOwner ("aleks", " Don ", "+1234567890 ");
        CarOwner alicja = createOwner(" alicja", " Don", " +2345678910");
        CarOwner michael = createOwner(" Michael ", " Bubnowsky", "+2345678910");


        Map< CarOwner, Set<Car>> ownersAndCars = new HashMap <> ();
        ownersAndCars.put( aleks, new HashSet<> ());
        ownersAndCars.put( alicja, new HashSet<> ());
        ownersAndCars.put ( michael, new HashSet<> ());

        ownersAndCars.get(aleks). add (sharedCar);
        ownersAndCars.get (michael). add (sharedCar);

        ownersAndCars.get(aleks).add(new Car());
        ownersAndCars.get (alicja). add (new Car ());
        ownersAndCars.get (michael).add (new Car());

        Set <CarOwner> ownersWithSameCars = new HashSet <>();
        Set <Car>  temporaryCars = new HashSet<>();
        for (Map.Entry<CarOwner, Set <Car>> entry: ownersAndCars.entrySet ()) {
            temporaryCars = entry.getValue();

            for(Map.Entry< CarOwner, Set<Car>> entrySecond: ownersAndCars.
                    entrySet()) {
                if (entrySecond.getKey (). equals (entry.getKey ())) {
                    System.out.println (" do nothing");
                } else {
                    for (Car car: entrySecond.getValue ()) {
                        if (temporaryCars.contains(car)) {
                            ownersWithSameCars.add(entrySecond.getKey());

                        }

              for (CarOwner owner: ownersWithSameCars) {
                  System.out.println(owner.firstName + " " + owner.lastName);

              }
}
}
}


        }


        }

    private static CarOwner createOwner(String name, String lastName, String phoneNumber) {
        CarOwner user = new CarOwner();
        user.lastName = lastName;
        user.firstName = name;
        user.phoneNumber = phoneNumber;
        return user;

    }
}
