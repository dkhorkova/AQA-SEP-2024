package org.prog.poly.eggs;

public class OleksiiCooks implements CookingSteps {
    @Override
    public void startOven() {
        System.out.println("Start inductive oven");
    }

    @Override
    public void pickFryingPan() {
        System.out.println("Picks iron frying pan");
    }

    @Override
    public void addOil() {
        System.out.println("Adds raps oil");
    }

    @Override
    public void addEggs(int amount) {
        System.out.println("Adds " + amount + " big chicken eggs eggs");
    }

    @Override
    public void eat() {
        System.out.println("Oleksii eats fried eggs");
    }
}
