package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man();
        man1.age=12;
        man1.address="jfhkjfre";
        man1.name ="jdkjhfrj";
        Man man2 = new Man();
        man2.age=454;
        man2.address="jfhkjfre";
        man2.name ="jdkjhfrj";



        System.out.println(man1.name + " " + man1.age + " " + man1.address);

        System.out.println(man2.name + " " + man2.age + " " + man2.address);



    }

    public static class Man {
        String name;
        int age;
        String address;


    }

    public static class Woman {
        String name;
        int age;
        String address;



    }

}


