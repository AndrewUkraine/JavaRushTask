package com.javarush.task.task29.task2909.human;

/**
 * Created by AndrewUkraine on 15.01.2018.
 */
public class Soldier extends Human implements Alive {


    public Soldier(String name, int age) {
        super(name, age);
    }


    public void fight() {
    }

    public void live() {
            fight();
    }
}
