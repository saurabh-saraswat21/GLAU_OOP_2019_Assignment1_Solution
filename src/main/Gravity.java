package main;

import java.util.Scanner;

public class Gravity {
    // TODO 1: Create the main method
    public static void main(String[] args) {
        //TODO 2:
        // a. Declare all your necessary variables inside main method.
        double speed;
        double time;
        double distance;
        // b. Declare a constant for 'gravity', assume the value to be 9.8
        double gravity = 9.8;
        //c. Calculate the result and print it to the screen.
        Scanner Scan = new Scanner(System.in);
        time = Scan.nextDouble();
        speed = gravity * time;
        distance = 0.5 * gravity * time * time;
        System.out.println("The speed of the object at " + time + " seconds after its release is " + speed + " and the distance the object has travelled in the " + time + " seconds after the release is " + distance);
        Scan.close();
    }
}