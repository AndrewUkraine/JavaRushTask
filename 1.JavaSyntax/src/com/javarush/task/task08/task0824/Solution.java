package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human(true, 12, "Vova"); //1й ребенок
        Human child2 = new Human(true, 11, "Petro"); //2й ребенок
        Human child3 = new Human(true, 10, "Gosha"); //3й ребенок
        Human dad = new Human(true, 25, "Andrew");
        dad.children.add(child1);
        dad.children.add(child2);
        dad.children.add(child3);                                      // отец 3 ребенка
        Human mom = new Human(false, 27, "Natasha");
        mom.children.add(child1);
        mom.children.add(child2);
        mom.children.add(child3);                                      // мать 3 ребенка
        Human grandMom1 = new Human(false, 61, "Gala");
        grandMom1.children.add(mom);                                   // баба 1 у нее дочь Natasha
        Human grandMom2 = new Human(false, 62,"Uta");
        grandMom1.children.add(dad);                                    // баба 2  у нее сын Andrew
        Human grandDad1 = new Human(true, 63, "Lusha");
        grandDad1.children.add(mom);                                    //деда 1 у нее дочь Natasha
        Human grandDad2 = new Human(true, 64, "Pusha");
        grandDad2.children.add(dad);                                      //деда 2


        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(dad);
        System.out.println(mom);
        System.out.println(grandDad1);
        System.out.println(grandDad2);
        System.out.println(grandMom1);
        System.out.println(grandMom2);
    }
    public static class Human {
    String name;
    boolean sex;
    int age;
    ArrayList<Human> children = new ArrayList<Human>();

    public Human(boolean sex, int age, String name ){
        this.sex = sex;
        this.age = age;
        this.name = name;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
