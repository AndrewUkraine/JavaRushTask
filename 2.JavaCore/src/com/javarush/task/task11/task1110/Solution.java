package com.javarush.task.task11.task1110;

/* 
Не забываем инкапсулировать
*/

public class Solution {
    public static void main(String[] args) {

    }

    public class Cat {
        private String name;
        private int age;
        private int weight;
        private int speed;



        private Cat(String name, int age, int weight, int speed) {
name =  "Dfsf";
age =12;
weight =12;
        speed = 12;


    }

    private String getName() {
        return this.name;
    }

        private int getAge() {
            return this.age;
        }

        private void setWeight(int weight) {
this.weight= weight;
        }

        private void setSpeed(int speed) {
this.speed = speed;
        }



    }

}

