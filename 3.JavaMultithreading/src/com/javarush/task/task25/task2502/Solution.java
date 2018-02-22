package com.javarush.task.task25.task2502;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

/* 
Машину на СТО не повезем!
*/
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() {
  wheels = new ArrayList<Wheel>();
  String a [] = loadWheelNamesFromDB();

if (a.length!=4){
    throw new IllegalArgumentException () ;
}

else for (int i=0; i<a.length; i++){
    wheels.add(Wheel.valueOf(a[i]));
}

        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
       // System.out.println(new Car().wheels);
    }
}
