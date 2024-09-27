package org.prog.collections;

//TODO: create Map which will allow you to track car owners and cars they own
//TODO: At least one car must be owned by two owners
//TODO: print owners that share cars
public class MapsHomework {

    public static void main(String[] args) {

    }

    public static CarOwner createOwner(String name, String lastName, String phoneNumber) {
        CarOwner user = new CarOwner();
        user.lastName = lastName;
        user.firstName = name;
        user.phoneNumber = phoneNumber;
        return user;
    }
}
