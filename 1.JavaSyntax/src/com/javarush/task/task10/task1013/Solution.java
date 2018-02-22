package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class Human {
        private String name;
        private int age;
        private String sex;
        private String live;
        private int weight;
        private String color;

        public Human (String name, int age, String sex, String  live, int weight, String color ){
           this.name = name;
           this.age = age;
           this.sex = sex;
           this.live = live;
           this.weight = weight;
           this.color = color;}

        public Human (String name, int age, String sex, String  live, int weight ){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.live = live;
            this.weight = weight;}

        public Human (String name, int age, String sex, String  live,  String color ){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.live = live;
            this.color = color;}

        public Human ( int age, String sex, String  live, int weight, String color ){

            this.age = age;
            this.sex = sex;
            this.live = live;
            this.weight = weight;
            this.color = color;}

        public Human (String name, String sex, String  live, int weight, String color ){
            this.name = name;
            this.sex = sex;
            this.live = live;
            this.weight = weight;
            this.color = color;}

        public Human (String name, int age, String sex,  int weight, String color ){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.color = color;}

        public Human (String name, int age, String sex,   String color ){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.color = color;}

        public Human (String name, int age,  int weight, String color ){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.color = color;}

        public Human (String name, String color ){
            this.name = name;
            this.color = color;}

        public Human (String name){
            this.name = name;}





    }
    }

