package org.prog.poly;

public class Ford implements ICar {
    public void driveForward() {
        System.out.println("Ford drives forward");
    }

    public void turn(String direction) {
        System.out.println("Ford turns " + direction);
    }

    public void honk() {
        System.out.println("Beep!");
    }
}
