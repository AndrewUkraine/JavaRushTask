package com.javarush.task.task29.task2909.car;

/**
 * Created by AndrewUkraine on 16.01.2018.
 */
public class Cabriolet extends Car {

    final int MAX_CABRIOLET_SPEED = 90;
    public Cabriolet( int numberOfPassengers) {
        super(Car.CABRIOLET, numberOfPassengers);
    }


    @Override
    public int getMaxSpeed() {
        return MAX_CABRIOLET_SPEED;
    }
}
