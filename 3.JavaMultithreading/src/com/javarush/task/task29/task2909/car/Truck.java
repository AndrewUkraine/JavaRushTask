package com.javarush.task.task29.task2909.car;

/**
 * Created by AndrewUkraine on 16.01.2018.
 */
public class Truck extends Car  {

    final int MAX_TRUCK_SPEED = 80;

    public Truck( int numberOfPassengers) {
        super(Car.TRUCK, numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {
        return MAX_TRUCK_SPEED;
    }
}
