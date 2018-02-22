package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human father1 = new Human("Антон", true, 56);
        Human mother1 = new Human("Иллона", false, 54);
        Human father2 = new Human("Костя", false, 65);
        Human mother2 = new Human("Юля", false, 60);
        Human ch1 = new Human("Женя", true, 21, father1, mother1);
        Human ch2 = new Human("Коля", true, 11, father1, mother1);
        Human ch3 = new Human("Оля", false, 14, father2, mother2);
        Human ch4 = new Human("Галя", false, 16, father2, mother2);
        Human ch5 = new Human("Петя", true, 25, father1, mother1);
        System.out.println(father1.toString());
        System.out.println(mother1.toString());
        System.out.println(father2.toString());
        System.out.println(mother2.toString());
        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
        System.out.println(ch3.toString());
        System.out.println(ch4.toString());
        System.out.println(ch5.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















