package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут

    static {
        readKeyFromConsoleAndInitPlanet();


    }

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = "";


        try {
            a = reader.readLine();
        } catch (IOException e) {
            System.out.println(e);}

            if (a.equals(Planet.SUN)) {
                thePlanet = Sun.getInstance();
            }

           else if (a.equals(Planet.MOON)) {
                thePlanet = Moon.getInstance();
            }

           else  if (a.equals(Planet.EARTH)) {
                thePlanet = Earth.getInstance();
            } else thePlanet = null;


        }
    }
