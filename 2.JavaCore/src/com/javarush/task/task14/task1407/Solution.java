package com.javarush.task.task14.task1407;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Player and Dancer
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("exit")) {
            if ("user".equals(key)) {
                person = new Player();}

            if ("loser".equals(key)) {
                person = new Player();}

            if ("coder".equals(key)) {
                person = new Player();}

            if ("proger".equals(key)) {
                person = new Player();}


            haveRest(person);
        }
    }

    public static void haveRest(Person person) {

if (person instanceof Player){
    Player player = (Player) person;
    player.play();}

  if (person instanceof Dancer){
      Dancer dancer = (Dancer) person;
      dancer.dance();}


    }

    interface Person {
    }

    static class Player implements Person {
        void play() {
            System.out.println("playing");
        }
    }

    static class Dancer implements Person {
        void dance() {
            System.out.println("dancing");
        }
    }
}
