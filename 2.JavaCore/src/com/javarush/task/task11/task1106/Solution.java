package com.javarush.task.task11.task1106;

/* 
Скрытный инкапсулированный кот
*/

public class Solution {
    public static void main(String[] args) {
    }

    private class Cat {
        private String name="dfcz";
        private int age = 12;
        private int weight = 3;

        private  Cat() {


        }

        private  Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }
}

