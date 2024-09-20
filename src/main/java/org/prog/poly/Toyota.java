package org.prog.poly;

public class Toyota implements ICar {

    public void driveForward() {
        System.out.println("Toyota drives forward");
    }

    public void turn(String direction) {
        System.out.println("Toyota turns " + direction);
    }

    public void honk() {
        System.out.println("Beep!");
    }
}
