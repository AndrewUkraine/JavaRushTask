package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Looser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;

        String key = null;
        key = reader.readLine();

        while ((key.equals("user")) || (key.equals("proger")) || (key.equals("coder")) || (key.equals("loser"))) {

            key = reader.readLine();
            if ("user".equals(key)) {
                person = new Person.User();
            }
            if ("loser".equals(key)) {
                person = new Person.Loser();
            }
            if ("coder".equals(key)) {
                person = new Person.Coder();
            }
            if ("proger".equals(key)) {
                person = new Person.Proger();
            }



            doWork(person);

        }

    }



    public static void doWork(Person person) {
        if (person instanceof Person.User){
            Person.User user = (Person.User) person;
     user.live();
        }


        if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();}

        if (person instanceof Person.Loser){((Person.Loser) person).doNothing();}
        if (person instanceof Person.Coder){((Person.Coder) person).coding();}

    }
}
