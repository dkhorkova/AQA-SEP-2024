package org.prog.poly.eggs;

public class VeronikaCooks implements CookingSteps {
    @Override
    public void startOven() {
        System.out.println("Start gas oven");
    }

    @Override
    public void pickFryingPan() {
        System.out.println("Picks anti-prigarnaya frying pan");
    }

    @Override
    public void addOil() {
        System.out.println("Adds Sunflower oil");
    }

    @Override
    public void addEggs(int amount) {
        System.out.println("Adds " + amount + " chicken eggs");
    }

    @Override
    public void eat() {
        System.out.println("Veronika eats fried eggs");
    }
}
