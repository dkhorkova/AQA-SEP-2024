package org.prog.poly.eggs;

public class EggsMain {

    public static void main(String[] args) {
        OleksiiCooks oleksiiCooks = new OleksiiCooks();
        VeronikaCooks veronikaCooks = new VeronikaCooks();

        cook(oleksiiCooks);
        cook(veronikaCooks);
    }

    public static void cook(CookingSteps cookingSteps) {
        cookingSteps.startOven();
        cookingSteps.pickFryingPan();
        cookingSteps.addOil();
        cookingSteps.addEggs(2);
        cookingSteps.eat();
    }
}
