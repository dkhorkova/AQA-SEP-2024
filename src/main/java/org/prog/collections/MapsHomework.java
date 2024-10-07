package org.prog.collections;

import org.prog.inheritance.DemoCar;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//TODO: create Map which will allow you to track car owners and cars they own
//TODO: At least one car must be owned by two owners
//TODO: print owners that share cars
public class MapsHomework {

    public static void main(String[] args) {
        DemoCar coOwnedDemoCar = new DemoCar("red");

        CarOwner john = createOwner("John", "Doe", "+1234567890");
        CarOwner jane = createOwner("Jane", "Doe", "+3216549870");
        CarOwner bob = createOwner("Bob", "Marley", "+65447891230");

        Map<CarOwner, Set<DemoCar>> ownersAndCars = new HashMap<>();
        ownersAndCars.put(john, new HashSet<>());
        ownersAndCars.put(jane, new HashSet<>());
        ownersAndCars.put(bob, new HashSet<>());

        ownersAndCars.get(john).add(coOwnedDemoCar);
        ownersAndCars.get(jane).add(coOwnedDemoCar);

        ownersAndCars.get(john).add(new DemoCar("blue"));
        ownersAndCars.get(jane).add(new DemoCar("yellow"));
        ownersAndCars.get(bob).add(new DemoCar("green"));

        Set<CarOwner> ownersWithSameCars = new HashSet<>();
        Set<DemoCar> temporaryDemoCars = new HashSet<>();
        for (Map.Entry<CarOwner, Set<DemoCar>> entry : ownersAndCars.entrySet()) {
            temporaryDemoCars = entry.getValue();
            for (Map.Entry<CarOwner, Set<DemoCar>> entrySecondary : ownersAndCars.entrySet()) {
                if (entrySecondary.getKey().equals(entry.getKey())) {
                    System.out.println("skip it");
                } else {
                    for (DemoCar demoCar : entrySecondary.getValue()) {
                        if (temporaryDemoCars.contains(demoCar)) {
                            ownersWithSameCars.add(entry.getKey());
                            ownersWithSameCars.add(entrySecondary.getKey());
                        }
                    }
                }
            }
        }

        for (CarOwner owner : ownersWithSameCars){
            System.out.println(owner.firstName + " " + owner.lastName);
        }
    }

    public static CarOwner createOwner(String name, String lastName, String phoneNumber) {
        CarOwner user = new CarOwner();
        user.lastName = lastName;
        user.firstName = name;
        user.phoneNumber = phoneNumber;
        return user;
    }
}
