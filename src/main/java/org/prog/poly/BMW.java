package org.prog.poly;

public class BMW implements ICar {
    public void driveForward() {
        System.out.println("BMW drives forward");
    }

    public void turn(String direction) {
        System.out.println("BMW turns " + direction);
    }

    public void honk() {
        System.out.println("Beep!");
    }
}
