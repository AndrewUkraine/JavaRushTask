package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

public class Dog {
     String name;
        static int age;


    public  void setName(String name) {
        this.name = name;
    }
    public  String getName() {
        return name;
    }

    public  void setAge(int age) {
        this.age = age;

    }
    public  int getAge() {
        return  age;

    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "куся";
                dog1.age = 12;
        System.out.println(age);
    }
}
