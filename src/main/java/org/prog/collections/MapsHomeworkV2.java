package org.prog.collections;

import org.prog.inheritance.DemoCar;

import java.util.*;

//TODO: create Map which will allow you to track car owners and cars they own
//TODO: At least one car must be owned by two owners
//TODO: print owners that share cars
public class MapsHomeworkV2 {

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

        Set<CarOwner> ownersOfSeveralCars = new HashSet<>();
        List<DemoCar> allDemoCars = new ArrayList<>();

        for (Set<DemoCar> c : ownersAndCars.values()) {
            allDemoCars.addAll(c);
        }

        Set<DemoCar> coOwnedDemoCars = new HashSet<>();
        
        for (DemoCar c : allDemoCars) {
            if (Collections.frequency(allDemoCars, c) > 1) {
                coOwnedDemoCars.add(c);
            }
        }

        for (Map.Entry<CarOwner, Set<DemoCar>> entry : ownersAndCars.entrySet()) {
            for (DemoCar demoCarWithMultipleOwners : coOwnedDemoCars) {
                if (entry.getValue().contains(demoCarWithMultipleOwners)) {
                    ownersOfSeveralCars.add(entry.getKey());
                }
            }
        }

        for (CarOwner owner : ownersOfSeveralCars) {
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
